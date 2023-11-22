-- Tworzenie tabeli Użytkownicy
CREATE TABLE Uzytkownicy (
    id INT PRIMARY KEY,
    login VARCHAR(255) UNIQUE,
    haslo VARCHAR(255),
    imie VARCHAR(255),
    nazwisko VARCHAR(255),
    email VARCHAR(255),
    telefon VARCHAR(20)
);

-- Tworzenie tabeli ObiektyRezerwacji
CREATE TABLE ObiektyRezerwacji (
    id INT PRIMARY KEY,
    nazwa VARCHAR(255),
    opis TEXT,
    adres VARCHAR(255),
    typ VARCHAR(50),
    innePolaSpecyficzne TEXT
);

-- Tworzenie tabeli Rezerwacje
CREATE TABLE Rezerwacje (
    id INT PRIMARY KEY,
    dataPoczatkowa DATETIME,
    dataKoncowa DATETIME,
    idUzytkownika INT,
    idObiektuRezerwacji INT,
    innePolaZwiazane TEXT,
    FOREIGN KEY (idUzytkownika) REFERENCES Uzytkownicy(id),
    FOREIGN KEY (idObiektuRezerwacji) REFERENCES ObiektyRezerwacji(id)
);

-- Tworzenie tabeli PotwierdzeniaRezerwacji
CREATE TABLE PotwierdzeniaRezerwacji (
    id INT PRIMARY KEY,
    idRezerwacji INT,
    dataPotwierdzenia DATETIME,
    kodPotwierdzenia VARCHAR(255),
    FOREIGN KEY (idRezerwacji) REFERENCES Rezerwacje(id)
);

-- Tworzenie tabeli Powiadomienia
CREATE TABLE Powiadomienia (
    id INT PRIMARY KEY,
    idUzytkownika INT,
    typPowiadomienia VARCHAR(50),
    tresc TEXT,
    dataWyslania DATETIME,
    FOREIGN KEY (idUzytkownika) REFERENCES Uzytkownicy(id)
);

-- Tworzenie tabeli HistoriaRezerwacji
CREATE TABLE HistoriaRezerwacji (
    id INT PRIMARY KEY,
    idRezerwacji INT,
    idUzytkownika INT,
    dataAkcji DATETIME,
    FOREIGN KEY (idRezerwacji) REFERENCES Rezerwacje(id),
    FOREIGN KEY (idUzytkownika) REFERENCES Uzytkownicy(id)
);
