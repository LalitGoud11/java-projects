create table FeatureRequest(
id INTEGER NOT NULL AUTO_INCREMENT,
title varchar(256) not null,
description varchar(256) not null,
client varchar(256) not null,
clientPriority varchar(256) not null,
targetDate varchar(256) not null,
productArea varchar(256) not null,
PRIMARY KEY(id)
);
