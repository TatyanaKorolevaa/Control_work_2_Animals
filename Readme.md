tk@tk-Ubuntu22:~$ mkdir Final_work
tk@tk-Ubuntu22:~$ cd Final_work
tk@tk-Ubuntu22:~/Final_work$
tk@tk-Ubuntu22:~/Final_work$ cat > Домашние_животные
tk@tk-Ubuntu22:~/Final_work$ nano Домашние_животные
tk@tk-Ubuntu22:~/Final_work$ cat > Вьючные_животные
tk@tk-Ubuntu22:~/Final_work$ echo "Лошади, верблюды, ослы" >> Вьючные_животные
tk@tk-Ubuntu22:~/Final_work$ nano Вьючные_животные
tk@tk-Ubuntu22:~/Final_work$ cat Домашние_животные Вьючные_животные > Животные
tk@tk-Ubuntu22:~/Final_work$ cat Животные
Собаки, кошки, хомяки
Лошади, верблюды, ослы
tk@tk-Ubuntu22:~/Final_work$ mv Животные Друзья_человека
tk@tk-Ubuntu22:~/Final_work$ ls -a
.  ..  Вьючные_животные  Домашние_животные  Друзья_человека
tk@tk-Ubuntu22:~/Final_work$ mkdir Work
tk@tk-Ubuntu22:~/Final_work$ ls -a
.  ..  Work  Вьючные_животные  Домашние_животные  Друзья_человека
tk@tk-Ubuntu22:~/Final_work$ mv Друзья_человека Work/
tk@tk-Ubuntu22:~/Final_work$ cd Work
tk@tk-Ubuntu22:~/Final_work/Work$ ls -a
.  ..  Друзья_человека
