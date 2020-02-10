package com.kkl.mygithubtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //포트폴리오 프로젝트 소스 관리 방법
    //1. 하루에 한번 꼭 백업(압축파일 : 프로젝트이름_날짜(0210.zip)
    //   로컬하드디스크/클라우드백업(네이버 클라우드 30Gb)
    //2. 버전관리 툴(SVN, Git - 소스관리규약)
    //3. Git서버 지원 사이트(Github, Bitbucket)
    //   하루에 한번이상은 Git올리기(Commit - 로컬저장소저장, push - 서버저장소저장)
    //   ,Pull - 서버에 있는 파일 내려받기

    //소스를 수정했습니다. asdasdasd

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
