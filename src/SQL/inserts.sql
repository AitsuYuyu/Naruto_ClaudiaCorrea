-- Inserts from table Ninja
INSERT INTO Ninja(ninjaId, name, rango, village) VALUES (1, "Naruto Uzumaki", "Hokage", "Konoha");
INSERT INTO Ninja(ninjaId, name, rango, village) VALUES (2, "Kakashi Hatake", "Sexto Hokage", "Konoha");
INSERT INTO Ninja(ninjaId, name, rango, village) VALUES (3, "gaara", "kage","Sunagakure");
INSERT INTO Ninja(ninjaId, name, rango, village) VALUES (4, "Obito Uchiha", "Chūnin", " Hi no Kuni");
INSERT INTO Ninja(ninjaId, name, rango, village) VALUES (5, "Hinata Hyuga", "Chūnin", "Konoha");
INSERT INTO Ninja(ninjaId, name, rango, village) VALUES (6, "Tsunade Senju", "kage", "Konoha");
INSERT INTO Ninja(ninjaId, name, rango, village) VALUES (7, "Shikamaru Nara", "Chūnin", "Konoha");


-- Inserts from tamble Ability
INSERT INTO Ability(ninjaId, name, description) VALUES (1, "Rasengan", "the Rasengan consists of concentrating and rotating the chakra at a focal point on the user's hand. The result is a spinning chakra sphere with immense destructive power.");
INSERT INTO Ability(ninjaId, name, description) VALUES (6, "Enormous force", "This is something that is explained when introduced to in part one. From the moment it is said that the first hokage was his grandfather and that he had a great physique and physical strength.");
INSERT INTO Ability(ninjaId, name, description) VALUES (2, "Taijutsu ", "Kakashi is most famous for his lightning release jutsu (lightning control), and his sharingan, which allows him to predict the movements of his opponents among other things. He is also highly skilled in both armed and unarmed combat.");
INSERT INTO Ability(ninjaId, name, description) VALUES (5, "Byakugan", "a dojutsu kekkei genkai which grants her near 360 degree vision (with the exception of a small blind spot at the upper thoracic vertebrate), x-ray vision and the ability to see the chakra pathway system.");
INSERT INTO Ability(ninjaId, name, description) VALUES (3, "Magnet Release", "which allows him to manipulate magnetic forces to control sand. An additional ability granted by Shukaku is the ability of Gaara to create massive seals, with Shukaku's sand and curse mark.");
INSERT INTO Ability(ninjaId, name, description) VALUES (7, "Shadow Imitation Technique", "'Shadow Possession Jutsu', the signature technique of his clan, with which he merges his shadow with an opponent's shadow, making them immobilized and forced to mimic Shikamaru's movements.");
INSERT INTO Ability(ninjaId, name, description) VALUES (4, "Mangekyo Sharingan", " is known as Kamui. With this ability, Obito gains access to a whole new dimension where he can transport things to, including himself. The ability that he possesses in his left eye and right eye differ greatly.");
INSERT INTO Ability(ninjaId, name, description) VALUES (6, "Ninjutsu", "Ground combat, standing combat, armed and unarmed, geography, acting, forgery, pharmacology, explosives, esotericism, espionage, infiltrations.");
INSERT INTO Ability(ninjaId, name, description) VALUES (2, "Dojutsu ", "This ocular technique has the ability to manipulate space, and has been shown to be able to suck targets or even tear off parts of a target and send them to another dimension, as well as being able to use this technique on himself to teleport from one place to another at the same time. instant.");
INSERT INTO Ability(ninjaId, name, description) VALUES (7, "Genjutsu ", "They are an advanced branch of ninja techniques (忍術 Ninjutsu) whose objective is to confuse the enemy's mind through the manipulation of chakra, that is, they are those techniques with which the user creates illusions.");
INSERT INTO Ability(ninjaId, name, description) VALUES (1, "Jinchūriki", "They are people within whom one of the nine existing Bijū (monsters of great power) is sealed.");


INSERT INTO Mission(missionId, description, rango, reward) VALUES (1, "mission regarding the national secrets of a village or country.", "S", " more than a million ryō ");
INSERT INTO Mission(missionId, description, rango, reward) VALUES (2, "This type of mission refers to the interests of the village and the country.", "A", " 150,000 to 1,000,000 ryō");
INSERT INTO Mission(missionId, description, rango, reward) VALUES (3, "These types of missions are expected to involve battle with other ninja.", "B", " 80,000 to 200,000 ryō");
INSERT INTO Mission(missionId, description, rango, reward) VALUES (4, "In these types of missions it is expected that the ninja involved will be harmed.", "C", "30,000 to 100,000 ryō");
INSERT INTO Mission(missionId, description, rango, reward) VALUES (5, "These types of missions do not involve direct battle or risk of death for the ninjas involved.", "D", "5,000 to 50,000 ryō");

-- Inserts from table NinjaMission
INSERT INTO NinjaMission(ninjaId, missionId, startDate, endDate) VALUES (1, 5, "2006-10-05", "2006-10-07");
INSERT INTO NinjaMission(ninjaId, missionId, startDate, endDate) VALUES (2, 2, "2006-09-23", "2006-10-15");
INSERT INTO NinjaMission(ninjaId, missionId, startDate, endDate) VALUES (3, 1, "2006-03-12", "2006-06-27");
INSERT INTO NinjaMission(ninjaId, missionId, startDate, endDate) VALUES (4, 1, "2003-04-04","2003-07-23");
INSERT INTO NinjaMission(ninjaId, missionId, startDate, endDate) VALUES (5, 4, "2006-05-12", "2006-05-29");
INSERT INTO NinjaMission(ninjaId, missionId, startDate, endDate) VALUES (6, 1, "2003-02-01", "2006-01-26");
INSERT INTO NinjaMission(ninjaId, missionId, startDate, endDate) VALUES (7, 3, "2006-08-23", "2006-10-18");



