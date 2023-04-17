# Java 개발자 도구
1. jak 17 설치 : java.com
2. 7zip 설치 :7zip.org
3.D2cooding font 설치
4. eclipse 설치 :eclipde.org 

## git repository 생성
1. 새로운 컴퓨터에서 최초로 github를 사용하고자 할 때 설정
```bash
  git config --global user.name hyeri1845

  git config --global user.email cjak0204@naver.com
  ```
2.새로운 원격 Repositoy를 생성하고, local Reposirory 생성하고자할때
```bash
git init
```
3. Roepository 에 대한 설명을 하기 위하여 README.md 파일 생성하기
2. local Repository 에 압축하고, 암호화하여 보관하기":git.init"
3. git config --global user.name hyeri1845
  git config --global user.email cjak0204@naver.com 

3. 현재 폴더의 파일과 폴더를 local Repository 에
압축하고, 암호화하여보관하기 :`git add.` 
4. 현재 local Repository 에 보관된 압축된 git remote add origin https://github.com/hyeri1845/Biz-2023-java.git
데이터에 대한 Comment 를 추가하기 :git commit-m first
4.원격 repository 별명 설정하기 :`git remote add`
### 기존의 reposiory 에 계속해서 update 하고자 할때

- 현재 폴더의 파일과 폴더를 local Repository 에 압축하고, 암호화하여
보관하기 : `git add .`
-현재 local Reposiyory 에 압축하고, 암호화하여 보관하기: git commit first
- locsl Repositiory 에 보관된 압축된 데잍터 원격 Repostiory 로
push: git push -u origin master


git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/hyeri1845/Biz-2023-java.git
git push -u origin master