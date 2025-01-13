# Project1. JDBC mysql 연동 CRUD 구현 프로젝트
### 📌 목차 📌 ###
- [프로젝트 개요](#-프로젝트-개요-)
- [ 프로젝트 구조 ](#-프로젝트-구조-)
- [ 팀원 소개 ](#-팀원-소개-)
- [ 데이터베이스 설계 ](#-데이터베이스-설계-)
- [ 주요 기능 ](#-주요-기능-)
- [ 실행 방법 ](#-실행-방법-)
- [ 참고 자료 ](#-참고-자료-)
<br><br>

### ✨ 프로젝트 개요 ✨

이 프로젝트는 **MySQL**과 **JDBC**를 사용하여 CRUD 기능을 구현한 프로젝트입니다. 지니뮤직 사이트의 데이터를 기반으로, 음악 리스트 관리 및 검색, 수정 기능을 제공하며 **데이터베이스** 연동을 통해 사용자 경험을 최적화 하였습니다.
프로젝트의 데이터 처리 및 서버 통신을 **JDBC**를 이용하여 직접 구현하였으며, **SQL 최적화**와 **트랜잭션 관리** 등 데이터 베이스 연동과 다양한 CRUD 기능을 구현하였습니다. 본 프로젝트는 **Git**을 통한 버전 관리와 **Agile 방식**으로 팀원들의 협업을 통해 진행되었습니다.
![_- visual selection](https://github.com/user-attachments/assets/1f477548-0f44-4573-8b40-4949e8f08a95)
<br><br>

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
<br><br>

### 🐣 팀원 소개 🐣

| 이름  | 역할                        |
| --- | ------------------------- |
| 이현정 | JDBC 연동 및 DAO 구현, Service, Controller 계층 구현         |
| 임하은 | 프로젝트 환경 설정 및 Service, Controller 계층 구현         |
| 장수현 | 데이터베이스 설계 및 SQL 작성, Service, Controller 계층 구현 |
| 정파란 | 데이터베이스 설계 및 SQL 작성, Service, Controller 계층 구현       |

<br><br>


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

<br><br>

#### 데이터 예시 (INSERT 문)

```sql
INSERT INTO song (artist, song_name, genre, art_type, url) VALUES
('DAY6(데이식스)', 'HAPPY', '락', 1, 'https://www.youtube.com/watch?v=2o1zdX72400'),
('멜로망스(MeloMance)', '선물', '인디', 1, 'https://www.youtube.com/watch?v=qYYJqWsBb1U'),
('Tyla', 'Water', '팝', 0, 'https://youtu.be/wlmUnWLaeog?si=IUZ4ieLBGhsL3bnh'),
```

---


### 🚀 주요 기능 🚀
![🚀 주요 기능 🚀 - visual selection](https://github.com/user-attachments/assets/43ef4398-699d-461c-851d-b51e4c83b42b)


#### 1. 전체 노래 조회

모든 노래 정보를 조회하여 콘솔에 출력합니다.

#### 2. 특정 노래 조회

입력된 제목에 해당하는 노래 정보를 조회합니다.

#### 3. 새로운 노래 추가

새로운 노래 정보를 데이터베이스에 추가합니다.

#### 4. URL 수정

입력된 노래 제목을 기준으로 URL을 수정합니다.

#### 5. 노래 삭제

입력된 제목과 가수를 기준으로 노래 정보를 삭제합니다.



---


### ▶️ 실행 방법 ▶️

1. MySQL에서 `song` 테이블을 생성하고 데이터를 삽입합니다.
2. `dp.properties` 파일에서 데이터베이스 연결 정보를 설정합니다.
   ```java
   # db.properites
   # mysql
    jdbc.driver=//driver
    jdbc.url=jdbc://db 연결 주소
    jdbc.id=//id
    jdbc.pw=//pw
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



