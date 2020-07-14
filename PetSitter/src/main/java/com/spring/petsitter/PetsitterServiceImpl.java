package com.spring.petsitter;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mapper.PetsitterMapper;
import com.spring.petsitter.board.ReviewBoardVO;

@Service("petsitterService")
public class PetsitterServiceImpl implements PetsitterService{

	@Autowired
	private SqlSession sqlSession;
	
	
	
	@Override
	public int petsitterNicknameCheck(PetsitterVO petsitter) {
		PetsitterMapper petsitterMapper = sqlSession.getMapper(PetsitterMapper.class);
		int res = petsitterMapper.petsitterNicknameCheck(petsitter);
		return res;
	}

	@Override
	public int reflyUpdate(ReviewBoardVO vo) {
		PetsitterMapper petsitterMapper = sqlSession.getMapper(PetsitterMapper.class);
		int res =petsitterMapper.reflyUpdate(vo);
		return res;
	}

	@Override
	public int petsitterUpdate(PetsitterVO petsitter) {
		PetsitterMapper petsitterMapper = sqlSession.getMapper(PetsitterMapper.class);
		int res = petsitterMapper.petsitterUpdate(petsitter);
		return res;
	}

	@Override
	public int petsitterSchedule(PetsitterScheduleVO petsitterSchedule) {
		PetsitterMapper petsitterMapper = sqlSession.getMapper(PetsitterMapper.class);
		int res = petsitterMapper.petsitterSchedule(petsitterSchedule);
		
		return res;
	}

	@Override
	public int petsitterInsert(PetsitterVO petsitter) {
		PetsitterMapper petsitterMapper = sqlSession.getMapper(PetsitterMapper.class);
		int res = petsitterMapper.insertPetsitter(petsitter);
		return res;
	}

	@Override
	public int petsitterCheck(PetsitterVO petsitter) {
		PetsitterMapper petsitterMapper = sqlSession.getMapper(PetsitterMapper.class);
		int res = petsitterMapper.petsitterCheck(petsitter);
		return res;
	}

	@Override
	public ArrayList<PetsitterVO> petsitterList() {
		PetsitterMapper petsitterMapper = sqlSession.getMapper(PetsitterMapper.class); 
		return petsitterMapper.petsitterList();
	}

	@Override
	public PetsitterVO selectPetsitter(PetsitterVO petsitter) {
		PetsitterMapper petsitterMapper = sqlSession.getMapper(PetsitterMapper.class); 
		PetsitterVO vo = new PetsitterVO();
		vo = petsitterMapper.selectPetsitter(petsitter);
		return vo;
	}

	@Override
	public int petsitterApproval(PetsitterVO petsitter) {
		PetsitterMapper petsitterMapper = sqlSession.getMapper(PetsitterMapper.class); 
		int res = petsitterMapper.petsitterApproval(petsitter);
		return res;
	}

	@Override
	public int petsitterRefusal(PetsitterVO petsitter) {
		PetsitterMapper petsitterMapper = sqlSession.getMapper(PetsitterMapper.class); 
		int res = petsitterMapper.petsitterRefusal(petsitter);
		return res;
	}
	
	
	
}
