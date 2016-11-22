-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema touradvisor
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema touradvisor
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `touradvisor` DEFAULT CHARACTER SET utf8 ;
USE `touradvisor` ;

-- -----------------------------------------------------
-- Table `touradvisor`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `touradvisor`.`users` (
  `user_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `username` VARCHAR(45) NULL,
  `email` VARCHAR(45) NOT NULL,
  `pssword` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `country` VARCHAR(45) NOT NULL,
  `image_1` VARCHAR(45) NULL,
  PRIMARY KEY (`user_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `touradvisor`.`my_list`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `touradvisor`.`my_list` (
  `my_list_id` INT NOT NULL AUTO_INCREMENT,
  `list_name` VARCHAR(45) NOT NULL,
  `location_name` VARCHAR(45) NOT NULL,
  `time_current` TIME NOT NULL,
  `today_date` DATE NOT NULL,
  `user_id` INT NOT NULL,
  PRIMARY KEY (`my_list_id`),
  INDEX `fk_my_list_users_idx` (`user_id` ASC),
  CONSTRAINT `fk_my_list_users`
    FOREIGN KEY (`user_id`)
    REFERENCES `touradvisor`.`users` (`user_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `touradvisor`.`my_tours`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `touradvisor`.`my_tours` (
  `my_tour_id` INT NOT NULL AUTO_INCREMENT,
  `tour_name` VARCHAR(45) NOT NULL,
  `location_name` VARCHAR(45) NOT NULL,
  `time_current` TIME NOT NULL,
  `today_date` DATE NOT NULL,
  `rating` VARCHAR(45) NULL,
  `user_id` INT NOT NULL,
  PRIMARY KEY (`my_tour_id`),
  INDEX `fk_my_tours_users1_idx` (`user_id` ASC),
  CONSTRAINT `fk_my_tours_users1`
    FOREIGN KEY (`user_id`)
    REFERENCES `touradvisor`.`users` (`user_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `touradvisor`.`geolocations`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `touradvisor`.`geolocations` (
  `geolocation_id` INT NOT NULL AUTO_INCREMENT,
  `location_name` VARCHAR(45) NOT NULL,
  `longitude` DECIMAL NOT NULL,
  `latitude` DECIMAL NOT NULL,
  `geolocation` DECIMAL NULL,
  PRIMARY KEY (`geolocation_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `touradvisor`.`attraction_sites`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `touradvisor`.`attraction_sites` (
  `attraction_site_id` INT NOT NULL AUTO_INCREMENT,
  `site_name` VARCHAR(45) NOT NULL,
  `location_name` VARCHAR(45) NOT NULL,
  `image_1` VARCHAR(200) NULL,
  `image_2` VARCHAR(200) NULL,
  `image_3` VARCHAR(200) NULL,
  `opening_hrs` VARCHAR(45) NULL,
  `geolocation_id` INT NOT NULL,
  PRIMARY KEY (`attraction_site_id`),
  INDEX `fk_attraction_sites_geolocations1_idx` (`geolocation_id` ASC),
  CONSTRAINT `fk_attraction_sites_geolocations1`
    FOREIGN KEY (`geolocation_id`)
    REFERENCES `touradvisor`.`geolocations` (`geolocation_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `touradvisor`.`animals`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `touradvisor`.`animals` (
  `animal_id` INT NOT NULL AUTO_INCREMENT,
  `animal_name` VARCHAR(45) NOT NULL,
  `place_1` VARCHAR(45) NOT NULL,
  `place_2` VARCHAR(45) NULL,
  `place_3` VARCHAR(45) NULL,
  `place_4` VARCHAR(45) NULL,
  `place_5` VARCHAR(45) NULL,
  `attraction_site_id` INT NOT NULL,
  PRIMARY KEY (`animal_id`),
  INDEX `fk_animals_attraction_sites1_idx` (`attraction_site_id` ASC),
  CONSTRAINT `fk_animals_attraction_sites1`
    FOREIGN KEY (`attraction_site_id`)
    REFERENCES `touradvisor`.`attraction_sites` (`attraction_site_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `touradvisor`.`accommodations`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `touradvisor`.`accommodations` (
  `accommodation_id` INT NOT NULL AUTO_INCREMENT,
  `restaurant_name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NULL,
  `phone` VARCHAR(45) NULL,
  `cost_per_day` VARCHAR(45) NULL,
  `image_1` VARCHAR(200) NULL,
  `image_2` VARCHAR(200) NULL,
  `image_3` VARCHAR(200) NULL,
  `attraction_site_id` INT NOT NULL,
  `geolocation_id` INT NOT NULL,
  PRIMARY KEY (`accommodation_id`),
  INDEX `fk_accommodations_attraction_sites1_idx` (`attraction_site_id` ASC),
  INDEX `fk_accommodations_geolocations1_idx` (`geolocation_id` ASC),
  CONSTRAINT `fk_accommodations_attraction_sites1`
    FOREIGN KEY (`attraction_site_id`)
    REFERENCES `touradvisor`.`attraction_sites` (`attraction_site_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_accommodations_geolocations1`
    FOREIGN KEY (`geolocation_id`)
    REFERENCES `touradvisor`.`geolocations` (`geolocation_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
