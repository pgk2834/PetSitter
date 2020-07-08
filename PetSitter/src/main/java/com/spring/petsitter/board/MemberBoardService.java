// 만드는중

package com.spring.petsitter.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface MemberBoardService {
	public List<MemberBoardVO> getBoardList(HashMap<String, Integer> hashmap);
	public int getListCount();
	public MemberBoardVO getDetail(int num);
	public int boardInsert(MemberBoardVO board);
	public MemberBoardVO boardModifyForm(int num);
	public int boardModify(MemberBoardVO modifyboard);
	public int boardDelete(HashMap<String, String> hashmap);
	public List<ReviewBoardVO> getReviewList();
	public List<ReviewBoardVO> updateLike_count(ReviewBoardVO vo);
	public List<ReviewBoardVO> updateLike_count2(ReviewBoardVO vo);
}
