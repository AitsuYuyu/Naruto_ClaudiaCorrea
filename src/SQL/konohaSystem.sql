
CREATE DATABASE Naruto_ClaudiaCorrea;

USE Naruto_ClaudiaCorrea;

CREATE TABLE `NinjaMission`(
    `ninjaId` INT NOT NULL,
    `missionId` INT NOT NULL,
    `startDate` DATE NOT NULL,
    `endDate` DATE NOT NULL
);
CREATE TABLE `Ability`(
    `ninjaId` INT NOT NULL,
    `name` VARCHAR(255) NOT NULL,
    `description` VARCHAR(500) NOT NULL
);
CREATE TABLE `Ninja`(
    `ninjaId` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(255) NOT NULL,
    `rango` VARCHAR(255) NOT NULL,
    `village` VARCHAR(255) NOT NULL
);
CREATE TABLE `Mission`(
    `missionId` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `description` VARCHAR(255) NOT NULL,
    `rango` ENUM('S', 'A', 'B', 'C', 'D') NOT NULL,
    `reward` VARCHAR(255) NOT NULL
);
ALTER TABLE
    `NinjaMission` ADD CONSTRAINT `ninjaMission_ninja_foreign` FOREIGN KEY(`ninjaId`) REFERENCES `Ninja`(`ninjaId`);
ALTER TABLE
    `Ability` ADD CONSTRAINT `ability_ninjaid_foreign` FOREIGN KEY(`ninjaId`) REFERENCES `Ninja`(`ninjaId`);
ALTER TABLE
    `NinjaMission` ADD CONSTRAINT `ninjaMission_mission_foreign` FOREIGN KEY(`missionId`) REFERENCES `Mission`(`missionId`);