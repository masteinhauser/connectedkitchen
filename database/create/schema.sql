-- Create an actual database for our application from scratch.
-- Start a transaction to allow roll-back if something fails.
BEGIN TRANSACTION;

-- Create our actual database.
CREATE DATABASE connectedkitchen;

-- Create a schema(sub-database) for our settings only.
CREATE SCHEMA settings;

-- Create a schema for all of our specific data, functions, etc.
CREATE SCHEMA data;

-- Set the search path for PostgreSQL to first look at our data.
SET SEARCH PATH 'data, public, settings';

-- Create our specific tables to store our data
CREATE TABLE users;
CREATE TABLE inventory;
CREATE TABLE recipes;

-- Create a user for our application for security and stability.
CREATE USER connectedkitchen

-- Let us modify our own data.
GRANT ALL ON DATABASE connectedkitchen TO connectedkitchen;

-- Finally! Create our changes to the database.
COMMIT;
