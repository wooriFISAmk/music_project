-- fisa DB사용;
USE fisa;

-- 노래 정보
DROP TABLE IF EXISTS song;

-- table 생성
CREATE TABLE song (
       song_id INT AUTO_INCREMENT PRIMARY KEY,
       artist VARCHAR(30) NOT NULL,
       song VARCHAR(30) NOT NULL,
       genre ENUM('랩','가요','팝','락','인디','댄스','힙합','드라마','R&B', 'OST', '발라드'),
       art_type TINYINT,
       url VARCHAR(100)
);
