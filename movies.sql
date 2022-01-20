BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "movies" (
	"sid"	INTEGER,
	"movie_name"	TEXT,
	"actor_name"	TEXT,
	"director_name"	TEXT,
	"yearofrelease"	INTEGER,
	PRIMARY KEY("sid" AUTOINCREMENT)
);
INSERT INTO "movies" VALUES (1,'Mission: Impossible III ','James McGarth','J.J. Abrams',2006);
INSERT INTO "movies" VALUES (2,'Ten Seconds to Hell','Jack Palance','Robert Aldrich',1959);
INSERT INTO "movies" VALUES (3,'Men of Crisis: The Harvey Wallinger Story','Diane Keaton','Woody Allen',1971);
INSERT INTO "movies" VALUES (4,'Untitled Wes Anderson film','Bill Murray','Wes Anderson',2006);
INSERT INTO "movies" VALUES (5,'Iron Man','Robert Downey Jr.','Jon Favreau',2008);
INSERT INTO "movies" VALUES (6,'Thor','Chris Hemsworth','Kenneth Branagh',2011);
COMMIT;
