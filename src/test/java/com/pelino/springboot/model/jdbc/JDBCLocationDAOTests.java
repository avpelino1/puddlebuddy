package com.pelino.springboot.model.jdbc;

import com.pelino.springboot.model.Location;
import com.pelino.springboot.model.dao.LocationDAO;
import org.junit.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.sql.SQLException;
import java.util.List;

public class JDBCLocationDAOTests {

    private static final String TEST_NAME = "TESTNAME";
    private static final Double TEST_LAT = 01.010101;
    private static final Double TEST_LONG = 02.020202;
    private Long TEST_ID;
    private Location TEST_LOCATION = new Location();

    private static SingleConnectionDataSource dataSource;
    private LocationDAO dao;
    private JdbcTemplate jdbc = new JdbcTemplate(dataSource);

    @BeforeClass
    public static void doBeforeAllTests(){
        dataSource = new SingleConnectionDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/puddlebuddy");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");
        dataSource.setAutoCommit(false);
    }

    @AfterClass
    public static void doAfterAllTests(){
        dataSource.destroy();
    }

    @Before
    public void setUp(){
        String sql = "INSERT INTO location (name, latitude, longitude) VALUES (?, ?, ?)";
        jdbc.update(sql, TEST_NAME, TEST_LAT, TEST_LONG);
        dao = new JDBCLocationDAO(dataSource);

        String sqlID = "SELECT location_id FROM location WHERE name = ?";
        SqlRowSet row = jdbc.queryForRowSet(sqlID, TEST_NAME);
        while(row.next()) {
            TEST_ID = row.getLong("location_id");
        }

        TEST_LOCATION = new Location(TEST_ID, TEST_NAME, TEST_LAT, TEST_LONG);
    }

    @After
    public void tearDown() throws SQLException {
        dataSource.getConnection().rollback();
    }

    @Test
    public void test_retrieve_location_by_id(){
        Location actual = dao.retrieveOneLocation(TEST_ID);

        Assert.assertEquals(TEST_LOCATION.getId(), actual.getId());
        Assert.assertEquals(TEST_LOCATION.getName(), actual.getName());
        Assert.assertEquals(TEST_LOCATION.getLatitude(), actual.getLatitude());
        Assert.assertEquals(TEST_LOCATION.getLongitude(), actual.getLongitude());
    }

    @Test
    public void test_retrieve_all_locations(){
        String sql = "SELECT count(*) FROM location";
        SqlRowSet row = jdbc.queryForRowSet(sql);
        int expected = 0;

        while(row.next()){
            expected = row.getInt("count");
        }

        List<Location> actual = dao.retrieveAllLocations();

        Assert.assertEquals(expected, actual.size());
    }

}
