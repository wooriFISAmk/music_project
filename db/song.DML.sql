use fisa;

-- 노래 정보 저장
-- 가수이름, 대표곡, 장르, 가수타입(0 혹은 1 입력), 노래링크 입력
INSERT INTO song (artist, song_name, genre, url) VALUES
('다이나믹듀오', '죽일놈', '랩', 'https://www.youtube.com/watch?v=CqBAVQOkui0'),
('아이유(IU)', 'Celebrity', '가요', 'https://www.youtube.com/watch?v=0-q1KafFCLU'),
('Red Hot Chill Peppers', 'Can\'t Stop', '팝', 'https://www.youtube.com/watch?v=8DyziWtkfBw'),
('DAY6(데이식스)', 'HAPPY', '락', 'https://www.youtube.com/watch?v=2o1zdX72400'),
('멜로망스(MeloMance)', '선물', '인디', 'https://www.youtube.com/watch?v=qYYJqWsBb1U'),
('VIVIZ(비비지)', 'MANIAC', '댄스', 'https://youtu.be/fCMZr8RUu5o?si=NgdGMLtQ9OKHkBw5'),
('Leellamarz', 'Trip(feat.Hannah)', '힙합', 'https://youtu.be/5C-UzW1FLiA?si=yHdo-FqQRv4yMRre'),
('BewhY(비와이)', '초월(feat.C JAMM)', '힙합', 'https://youtu.be/RtId5YPBnus?si=7mF_CbgGBQMZqSUS'),
('LUCY', 'Run to You', '드라마', 'https://youtu.be/84MT_TR8dWg?si=sngqVndCve77hmZg'),
('BIG Naughty(서동현)', '직항', '락', 'https://youtu.be/VF9f1sWjlRQ?si=xNft7M2l6TV44PBT'),
('Tyla', 'Water', '팝', 'https://youtu.be/wlmUnWLaeog?si=IUZ4ieLBGhsL3bnh'),
('aespa', 'Whiplash', '댄스', 'https://youtu.be/jWQx2f-CErU?si=zqCsJweLyDVf2dVV'),
('전소미', '금금금', '힙합', 'https://youtu.be/H0Ugx2a_-tw?si=FDSB5Ivna-JjXXr3'),
('WOODZ', 'FEEL LIKE', 'R&B', 'https://youtu.be/z2KMxSb4GIo?si=ir7d77-CrlXaNK3j'),
('NewJeans', 'ETA', '댄스', 'https://youtu.be/jOTfBlKSQYY?si=dSrVLVgYwEeV7880'),
('우주소녀', '이루리', '댄스', 'https://www.youtube.com/watch?v=2Q9G6R2hKIQ'),
('태연(TAEYEON)', 'All With You', 'OST', 'https://www.youtube.com/watch?v=8Q2mth2bX10'),
('DAY6(데이식스)', '예뻤어', '락', 'https://www.youtube.com/watch?v=BS7tz2rAOSA'),
('김나영', '어른이 된다는 게', '발라드', 'https://www.youtube.com/watch?v=86Rr_rTdzIo'),
('아이유(IU)', '밤편지', '발라드', 'https://www.youtube.com/watch?v=BzYnNdJhZQw');

commit;
