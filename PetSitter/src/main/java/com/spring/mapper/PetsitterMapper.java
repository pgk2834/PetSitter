package com.spring.mapper;

import java.util.ArrayList;

import com.spring.petsitter.PetsitterScheduleVO;
import com.spring.petsitter.PetsitterVO;
import com.spring.petsitter.board.ReviewBoardVO;

public interface PetsitterMapper {
	
	public int insertPetsitter(PetsitterVO petsitter); //펫시터 회원가입 insert
	public int petsitterCheck(PetsitterVO petsitter); //펫시터 회원 확인
	public ArrayList<PetsitterVO> petsitterList(); //펫시터 목록
	public PetsitterVO selectPetsitter(PetsitterVO petsitter); //ID로 펫시터 정보 select
	public int petsitterApproval(PetsitterVO petsitter); //펫시터 신청허가시 업데이트
	public int petsitterRefusal(PetsitterVO petsitter); //펫시터 신청거절시 업데이트
	public int petsitterSchedule(PetsitterScheduleVO petsitterSchedule); //펫시터 스케줄 추가
	public int petsitterUpdate(PetsitterVO petsitter); //펫시터 정보변경
	public int reflyUpdate(ReviewBoardVO vo); //리뷰 답변
	public int petsitterNicknameCheck(PetsitterVO petsitter);
}
