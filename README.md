# Project1. JDBC mysql 연동 CRUD 구현 실습

### 🎵🎶 프로젝트 개요 🎶🎵

이 프로젝트는 **MySQL**과 **JDBC**를 사용하여 CRUD 기능을 구현한 실습 프로젝트입니다. 프로젝트는 팀원들의 협업을 통해 진행되었으며, 지니뮤직 사이트를 참고하여 데이터를 수집하고, 이를 기반으로 데이터베이스 연동과 다양한 CRUD 기능을 구현하였습니다.

---

### 👥 팀원 소개 👥

| 이름  | 역할                        |
| --- | ------------------------- |
| 이현정 | JDBC 연동 및 DAO 구현, Service, Controller 계층 구현         |
| 임하은 | 프로젝트 환경 설정 및 Service, Controller 계층 구현         |
| 장수현 | 데이터베이스 설계 및 SQL 작성, Service, Controller 계층 구현 |
| 정파란 | 데이터베이스 설계 및 SQL 작성, Service, Controller 계층 구현       |

---

### 🗂️ 데이터베이스 설계 🗂️

#### 테이블 구조: `song`

지니뮤직 사이트에서 수집한 데이터를 기반으로 아래와 같은 테이블 구조를 설계했습니다.

```sql
-- table 생성
CREATE TABLE song (
       song_id INT AUTO_INCREMENT PRIMARY KEY,
       artist VARCHAR(30) NOT NULL,
       song_name VARCHAR(30) NOT NULL,
       genre ENUM('랩','가요','팝','락','인디','댄스','힙합','드라마','R&B', 'OST', '발라드'),
       art_type TINYINT,
       url VARCHAR(100)
);
```

#### 데이터 예시 (INSERT 문)

```sql
INSERT INTO song (artist, song_name, genre, art_type, url) VALUES
('DAY6(데이식스)', 'HAPPY', '락', 1, 'https://www.youtube.com/watch?v=2o1zdX72400'),
('멜로망스(MeloMance)', '선물', '인디', 1, 'https://www.youtube.com/watch?v=qYYJqWsBb1U'),
('Tyla', 'Water', '팝', 0, 'https://youtu.be/wlmUnWLaeog?si=IUZ4ieLBGhsL3bnh'),
```

---

### 🚀 주요 기능 🚀

#### 1. 전체 노래 조회

모든 노래 정보를 조회하여 콘솔에 출력합니다.

```java
public static void getAllSongs() {
		try {
			EndView.songListView(s.getAllSongs());
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.showError("전체 노래 조회 오류");
		}
	}
```

#### 2. 특정 노래 조회

입력된 제목에 해당하는 노래 정보를 조회합니다.

```java
public static void getSongByTitle(String title) {
    try {
        EndView.songView(s.getSongByTitle(title));
    } catch (SQLException e) {
        e.printStackTrace();
        EndView.showError("노래 조회 오류");
    }
}
```

#### 3. 새로운 노래 추가

새로운 노래 정보를 데이터베이스에 추가합니다.

```java
public static boolean createSong(SongDTO song) {
		boolean result = false;
		try {
			result = SongDAO.createSong(song);
		} catch (SQLException s) {
			s.printStackTrace();
		}
		return result;
	}
```

#### 4. URL 수정

입력된 노래 제목을 기준으로 URL을 수정합니다.

```java
public static void updateUrlBySongName(String songName, String url) {
    try {
        s.updateUrlBySongName(songName, url);
    } catch (Exception e) {
        e.printStackTrace();
        EndView.showError("노래 URL 수정 오류");
    }
}
```

#### 5. 노래 삭제

입력된 제목과 가수를 기준으로 노래 정보를 삭제합니다.

```java
public static boolean deleteSong(String songName, String artist) {
    try {
        return SongDAO.deleteSong(songName, artist);
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
```

---

### 📂 프로젝트 구조 📂

```
├── src
│   ├── controller
│   │   └── SongController.java
│   ├── model
│   │   ├── dto
│   │   │   └── SongDTO.java
│   │   ├── util
│   │   │   └── DBUtil.java
│   │   └── SongDAO.java
│   ├── service
│   │   ├── SongService.java
│   │   └── SongServiceImp.java
│   └── view
│       └── StartView.java
│       └── EndView.java
└── README.md
```

---

### 🛠️ 사용 기술 🛠️

- **Java**
- **MySQL**
- **JDBC**
- **Git** 및 **GitHub**

---

### ▶️ 실행 방법 ▶️

1. MySQL에서 `song` 테이블을 생성하고 데이터를 삽입합니다.
2. 'dp.properties' 파일에서 데이터베이스 연결 정보를 설정합니다.
   ```java
   # db.properites
   # mysql
    jdbc.driver=driver
    jdbc.url=jdbc:db 연결 주소
    jdbc.id=id
    jdbc.pw=pw
  ```
	
3. `DBUtil.java` 파일에서 데이터베이스 연결 정보를 설정합니다.
   ```java
   public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(p.getProperty("jdbc.url"), p.getProperty("jdbc.id"), p.getProperty("jdbc.pw"));
	}
   ```
5. 프로젝트를 실행하여 CRUD 기능을 테스트합니다.

---

### 📖 참고 자료 📖

- [지니뮤직 공식 사이트](https://www.genie.co.kr)



