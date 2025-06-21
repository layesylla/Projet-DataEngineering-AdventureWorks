# Projet-DataEngineering-AdventureWorks
# Projet Data Engineering : ETL + Modélisation + BI

## Objectif
Extraire, transformer et charger les données d'AdventureWorks (SQL Server) dans un Data Warehouse (PostgreSQL), modéliser en étoile, et analyser avec Power BI.

## Tech stack
- Docker (SQL Server, Spark, PostgreSQL)
- Apache Spark avec Scala
- JDBC (SQL Server et PostgreSQL)
- Power BI

## Structure
- `app/` : code Spark ETL et drivers JDBC
- `docker-compose.yml` : configuration des conteneurs
- `doc/` : instructions de déploiement
- `capture_powerbi/` : captures ou fichiers `.pbix` du dashboard

## Étapes réalisées
- Connexion SQL Server via JDBC
-  Extraction des données avec Spark
-  Création des tables dimensionnelles et de la table de faits
-  Chargement dans PostgreSQL
- 🚧 Power BI (à faire par le binôme)

## Instructions d'exécution
Voir `doc/instructions_etl.md`
