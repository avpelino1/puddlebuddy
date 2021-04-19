CREATE TABLE location (
    location_id serial NOT NULL,
    name varchar(100) NOT NULL,
    latitude decimal(9,6) NOT NULL,
    longitude decimal(9,6) NOT NULL
);

INSERT INTO location (name, latitude, longitude) VALUES ('Scioto Audubon Metro Park', 39.9481, 83.0068);
INSERT INTO location (name, latitude, longitude) VALUES ('Wildcat Hollow Hiking Trail', 39.5728, 82.0328);
INSERT INTO location (name, latitude, longitude) VALUES ('Malabar Farm State Park', 40.6526, 82.3985);
INSERT INTO location (name, latitude, longitude) VALUES ('Mohican State Park', 40.6102, 82.2653);
INSERT INTO location (name, latitude, longitude) VALUES ('Olympic National Park', 47.8021, 123.6044);
INSERT INTO location (name, latitude, longitude) VALUES ('Exit 38: Far Side Trailhead', 47.4313, 121.6323);
INSERT INTO location (name, latitude, longitude) VALUES ('Mount Rainier National Park', 46.8800, 121.7269);