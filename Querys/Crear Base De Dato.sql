CREATE DATABASE EstudiantesDev
ON 
PRIMARY 
(	
	NAME = EstudiantesDevPrimary,
	FILENAME = 'C:\Users\diosl\Documents\SQLProjects\DataBase\EstudiantesDev\EstudiantesDevPrimary.mdf',
	SIZE = 5MB,
	MAXSIZE = 25,
	FILEGROWTH = 5
),

FILEGROUP EstudiantesDevFG
(
	NAME = EstudiantesDevData,
	FILENAME = 'C:\Users\diosl\Documents\SQLProjects\DataBase\EstudiantesDev\EstudiantesDevData.ndf',
	SIZE = 5MB,
	MAXSIZE = 25,
	FILEGROWTH = 5
)

LOG ON 
(
	NAME = EstudiantesDevLog,
	FILENAME = 'C:\Users\diosl\Documents\SQLProjects\DataBase\EstudiantesDev\EstudiantesDevLog.ldf',
	SIZE = 5MB,
	MAXSIZE = 25MB,
	FILEGROWTH = 5MB
);