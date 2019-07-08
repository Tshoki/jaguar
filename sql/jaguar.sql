set names utf8;
set foreign_key_checks = 0;

drop database if exists jaguar;
create database if not exists jaguar;

use jaguar;

create table user_info(
id int primary key not null auto_increment,
user_id varchar(16) unique not null,
password varchar(16) not null,
family_name varchar(32) not null,
first_name varchar(32) not null,
family_name_kana varchar(32) not null,
first_name_kana varchar(32) not null,
sex tinyint default 0,
email varchar(32),
status tinyint not null default 0,
logined tinyint not null default 0,
regist_date datetime,
update_date datetime
);

insert into user_info values
(1,"guest", "guest","テスト","太郎","てすと","たろう",0,"guest@gmail.com",0,0,now(),now()),
(2,"guest2","guest2","テスト","太郎2","てすと","たろう2",0,"guest2@gmail.com",0,0,now(),now()),
(3,"guest3","guest3","テスト","太郎3","てすと","たろう3",0,"guest3@gmail.com",0,0,now(),now()),
(4,"guest4","guest4","テスト","太郎4","てすと","たろう4",0,"guest4@gmail.com",0,0,now(),now()),
(5,"guest5","guest5","テスト","太郎5","てすと","たろう5",0,"guest5@gmail.com",0,0,now(),now()),
(6,"guest6","guest6","テスト","太郎6","てすと","たろう6",0,"guest6@gmail.com",0,0,now(),now()),
(7,"guest7","guest7","テスト","太郎7","てすと","たろう7",0,"guest7@gmail.com",0,0,now(),now()),
(8,"guest8","guest8","テスト","太郎8","てすと","たろう8",0,"guest8@gmail.com",0,0,now(),now()),
(9,"guest9","guest9","テスト","太郎9","てすと","たろう9",0,"guest9@gmail.com",0,0,now(),now()),
(10,"guest10","guest10","テスト","太郎10","てすと","たろう10",0,"guest10@gmail.com",0,0,now(),now()),
(11,"guest11","guest11","テスト","太郎11","てすと","たろう11",0,"guest11@gmail.com",0,0,now(),now()),
(12,"guest12","guest12","テスト","太郎12","てすと","たろう12",0,"guest12@gmail.com",0,0,now(),now());

create table product_info(
id int primary key auto_increment not null,
product_id int unique not null,
product_name varchar(100) unique not null,
product_name_kana varchar(100) unique not null,
product_description varchar(255),
category_id int not null, /*外部キー制約　親テと子テの整合性のため*/
price int not null,
image_file_path varchar(100) not null,
image_file_name varchar(50) not null,
release_date datetime,
release_company varchar(50),
status tinyint default 1,
regist_date datetime,
update_date datetime,
foreign key (category_id) references m_category (category_id)
);

insert into product_info values
(1,1,"本1","ほん1","本1の詳細",2,100,"./images","sample.jpg",now(),"発売会社",1,now(),now()),
(2,2,"本2","ほん2","本2の詳細",2,100,"./images","sample.jpg",now(),"発売会社",1,now(),now()),
(3,3,"本3","ほん3","本3の詳細",2,100,"./images","sample.jpg",now(),"発売会社",1,now(),now()),
(4,4,"本4","ほん4","本4の詳細",2,100,"./images","sample.jpg",now(),"発売会社",1,now(),now()),
(5,5,"本5","ほん5","本5の詳細",2,100,"./images","sample.jpg",now(),"発売会社",1,now(),now()),
(6,6,"家電・パソコン1","かでん・ぱそこん1","家電・パソコン1の詳細",3,100,"./images","sample.jpg",now(),"発売会社",1,now(),now()),
(7,7,"家電・パソコン2","かでん・ぱそこん2","家電・パソコン2の詳細",3,100,"./images","sample.jpg",now(),"発売会社",1,now(),now()),
(8,8,"家電・パソコン3","かでん・ぱそこん3","家電・パソコン3の詳細",3,100,"./images","sample.jpg",now(),"発売会社",1,now(),now()),
(9,9,"家電・パソコン4","かでん・ぱそこん4","家電・パソコン4の詳細",3,100,"./images","sample.jpg",now(),"発売会社",1,now(),now()),
(10,10,"家電・パソコン5","かでん・ぱそこん5","家電・パソコン5の詳細",3,100,"./images","sample.jpg",now(),"発売会社",1,now(),now()),
(11,11,"おもちゃ・ゲーム1","おもちゃ・げーむ1","おもちゃ・ゲーム1の詳細",4,100,"./images","sample.jpg",now(),"発売会社",1,now(),now()),
(12,12,"おもちゃ・ゲーム2","おもちゃ・げーむ2","おもちゃ・ゲーム2の詳細",4,100,"./images","sample.jpg",now(),"発売会社",1,now(),now()),
(13,13,"おもちゃ・ゲーム3","おもちゃ・げーむ3","おもちゃ・ゲーム3の詳細",4,100,"./images","sample.jpg",now(),"発売会社",1,now(),now()),
(14,14,"おもちゃ・ゲーム4","おもちゃ・げーむ4","おもちゃ・ゲーム4の詳細",4,100,"./images","sample.jpg",now(),"発売会社",1,now(),now()),
(15,15,"おもちゃ・ゲーム5","おもちゃ・げーむ5","おもちゃ・ゲーム5の詳細",4,100,"./images","sample.jpg",now(),"発売会社",1,now(),now()),
(16,16,"CD1","しーでぃー1","CD1の詳細",5,100,"./images","sample.jpg",now(),"発売会社",1,now(),now()),
(17,17,"CD2","しーでぃー2","CD2の詳細",5,100,"./images","sample.jpg",now(),"発売会社",1,now(),now()),
(18,18,"CD3","しーでぃー3","CD3の詳細",5,100,"./images","sample.jpg",now(),"発売会社",1,now(),now()),
(19,19,"CD4","しーでぃー4","CD4の詳細",5,100,"./images","sample.jpg",now(),"発売会社",1,now(),now()),
(20,20,"CD5","しーでぃー5","CD5の詳細",5,100,"./images","sample.jpg",now(),"発売会社",1,now(),now());

create table cart_info(
id int primary key not null auto_increment,
user_id varchar(16) not null,
product_id int not null, /*外部キー制約*/
product_count int not null,
regist_date datetime,
update_date datetime,
foreign key (product_id) references product_info (product_id)
);

create table purchase_history_info(
id int primary key auto_increment not null,
user_id varchar(16) not null, /*外部キー制約*/
product_id int not null, /*外部キー制約*/
product_count int,
price int not null,
destination_id int, /*？外部キー制約？*/
regist_date datetime,
update_date datetime,
foreign key (user_id) references user_info (user_id),
foreign key (product_id) references product_info (product_id),
foreign key (destination_id) references destination_info (id)
);

create table destination_info(
id int primary key not null auto_increment,
user_id varchar(16) not null, /*外部キー制約*/
family_name varchar(32) not null,
first_name varchar(32) not null,
family_name_kana varchar(32) not null,
first_name_kana varchar(32) not null,
email varchar(32) not null,
tel_number varchar(13),
user_address varchar(50) not null,
regist_date datetime,
update_date datetime,
foreign key (user_id) references user_info (user_id)
);

insert into destination_info value
(1,"guest","テスト","太郎","てすと","たろう","guest@gmail.com","080-1234-6789","神奈川県川崎市幸区神明町1-2-3",now(),now());

create table m_category(
id int primary key not null auto_increment,
category_id int unique not null,
category_name varchar(20) unique not null,
category_description varchar(100),
insert_date datetime not null,
update_date datetime
);

insert into m_category values
(1,1,"全てのカテゴリー","本、家電・パソコン、おもちゃ・ゲーム、CD全てのカテゴリーが対象になります",now(),now()),
(2,2,"本","本に関するカテゴリーが対象になります",now(),now()),
(3,3,"家電・パソコン","家電・パソコンに関するカテゴリーが対象になります",now(),now()),
(4,4,"おもちゃ・ゲーム","おもちゃ・ゲームに関するカテゴリーが対象になります",now(),now()),
(5,5,"CD","CDに関するカテゴリーが対象になります",now(),now());