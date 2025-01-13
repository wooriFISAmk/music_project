# ☀️ JDBC를 활용한 음악 데이터 관리 프로젝트

<br>

### 👨‍👩‍👧‍👦 팀원 소개 👨‍👩‍👧‍👦
| <img src="https://github.com/nanahj.png" width="80"> | <img src="https://github.com/imhaeunim.png" width="80"> | <img src="https://github.com/Aunsxm.png" width="80"> | <img src="https://github.com/BlueRedOrange.png" width="80"> |
|:---:|:---:|:---:|:---:|
| [이현정](https://github.com/nanahj) | [임하은](https://github.com/imhaeunim) | [장수현](https://github.com/Aunsxm) | [정파란](https://github.com/BlueRedOrange) |

<br>

---

<br>

### 📌 프로젝트 개요 📌
[🔗 프로젝트 구조 ](#-프로젝트-구조-)  
[🔗 데이터베이스 설계 ](#-데이터베이스-설계-)  
[🔗 주요 기능 ](#-주요-기능-)  
[🔗 트러블슈팅 ](#-트러블슈팅-)  
[🔗 고찰 ](#-고찰-)  
[🔗 참고 자료 ](#-참고-자료-)  

<br>

이 프로젝트는 **Java**와 **MySQL**을 사용하여 **MVC 패턴**을 구성하였습니다. 지니뮤직 사이트의 데이터를 기반으로 음악 검색, 수정, 삭제 등 CRUD 기능을 제공하며 **데이터베이스** 연동을 통해 사용자 경험을 최적화 하였습니다.
프로젝트의 데이터 처리 및 서버 통신은 **JDBC**를 이용하여 직접 구현하였으며, **SQL 최적화**와 **트랜잭션 관리** 등 데이터 베이스 연동과 다양한 CRUD 기능을 구현하였습니다. 본 프로젝트는 **Git**을 통한 버전 관리와 **Agile 방식**으로 팀원들의 협업을 통해 진행되었습니다.

<p align="center">
  <img src="https://github.com/user-attachments/assets/1f477548-0f44-4573-8b40-4949e8f08a95" width="500"/>
</p>

<br>
<br>

### 📂 프로젝트 구조 📂

```
├── src
│   ├── song.controller
│   │   └── SongController.java
│   ├── song.model
│   │   ├── dto
│   │   │   └── SongDTO.java
│   │   ├── util
│   │   │   └── DBUtil.java
│   │   └── SongDAO.java
│   ├── song.service
│   │   ├── SongService.java
│   │   └── SongServiceImp.java
│   └── song.view
│       ├── StartView.java
│       └── EndView.java
└── README.md
```
<br>

---

<br>


### 📝 데이터베이스 설계 📝

#### 테이블 구조: `song`


지니뮤직 사이트에서 수집한 데이터를 기반으로 아래와 같은 테이블 구조를 설계했습니다.

<table style="width: 100%; border: 0; table-layout: fixed;">
  <tr>
    <td style="width: 100%; text-align: center; vertical-align: top;">
      <img src="https://github.com/user-attachments/assets/883d8b45-e592-48e4-ab84-0772c8fe45bd" width="80%" />
    </td>
    <td style="width: 50%; vertical-align: top;">
      <pre style="white-space: pre-wrap; word-wrap: break-word;">
CREATE TABLE song (
       song_id INT AUTO_INCREMENT PRIMARY KEY,
       artist VARCHAR(30) NOT NULL,
       song_name VARCHAR(30) NOT NULL,
       genre ENUM('랩','가요','팝','락','인디','댄스',
	      '힙합','드라마','R&B', 'OST', '발라드'),
       art_type TINYINT,
       url VARCHAR(100)
);
      </pre>
    </td>
  </tr>
</table>

#### 데이터 예시

<img src="https://github.com/user-attachments/assets/04cadfe3-510f-45b8-b0d9-cf094b2c1bd5" width="700"/>

<br>

---

<br>


### 🚀 주요 기능 🚀
<p>
  <img src="https://github.com/user-attachments/assets/43ef4398-699d-461c-851d-b51e4c83b42b" width=500"/>
</p>

#### 1. 전체 노래 조회

모든 노래 정보를 조회하여 콘솔에 출력합니다.
<br>
(💻 출력)
<table>
	<td>
		<img src="https://github.com/user-attachments/assets/dc045074-606c-41e3-a319-ac33213b308e" width="700"/>
	</td>
</table>

#### 2. 특정 노래 조회

입력된 제목에 해당하는 노래 정보를 조회합니다.
<br>
(💻 출력)
<table>
	<td>
<img src="https://github.com/user-attachments/assets/f0c889d9-3e6f-415e-9ae8-9bc210fb3ff4" width="700"/>
	</td>
</table>

#### 3. 새로운 노래 추가

새로운 노래 정보를 데이터베이스에 추가합니다.
<br>
(💻 출력)
<table>
	<td>
<img src="https://github.com/user-attachments/assets/d2e2f349-1994-4f2a-82dc-38661e8ecef0" width="700"/>
	</td>
</table>

#### 4. URL 수정

입력된 노래 제목을 기준으로 URL을 수정합니다.
<br>
(💻 출력)
<table>
	<td>
<img src="https://github.com/user-attachments/assets/6d9523c2-b62a-454a-b212-66ff64d357e1" width="700"/>
	</td>
</table>


#### 5. 노래 삭제

입력된 제목과 가수를 기준으로 노래 정보를 삭제합니다.
<br>
(💻 출력)
<table>
	<td>
<img src="https://github.com/user-attachments/assets/7869db0d-1fd2-4d58-a208-8e291e96562c" width="500" />
	</td>
</table>

<br>


---

<br>

### 🔥 트러블슈팅 🔥 ###
-  `.gitignore` 설정 문제
   - 초기 프로젝트 설정 시, 데이터베이스 설정 파일(db.properties) 및 환경 설정 파일이 .gitignore에 포함되지 않아 깃허브에 민감 정보가 노출되는 문제가 발생했습니다.
   - .gitignore에 파일 이름만 추가하고, 해당 파일이 이미 커밋에 포함된 상태에서 변경 사항을 적용하지 않았던 것이 원인이었습니다.
   - 해결 방법
     ``` bash
     git rm --cached db.properties
     git commit -m "Remove sensitive data"
     ```

<br><br>

### 💡 고찰 💡 ###
- 초기 기획 단계에서 프로젝트의 세부 요구사항을 충분히 논의하지 않아 중간 단계에서 수정 작업이 빈번하게 발생하였습니다. 테이블을 수정하고 데이터를 반영하는 과정에서 혼란이 있었습니다. 이를 통해 기획과 설계의 중요성을 깨달았습니다.
- 코드 컨벤션만 설정하고 커밋 컨벤션을 설정하지 않아 커밋 기록을 보고 수정 사항을 확실히 파악할 수 없었습니다. 커밋 메시지를 체계적으로 관리하는 것이 협업과 코드 유지보수에서 매우 큰 도움이 되는 것을 실감하였습니다.

<br><br>

### 📖 참고 자료 📖

- [지니뮤직 공식 사이트](https://www.genie.co.kr)



