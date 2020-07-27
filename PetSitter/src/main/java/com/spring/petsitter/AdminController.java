package com.spring.petsitter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.petsitter.board.mboard.MReplyService;
import com.spring.petsitter.board.mboard.MemberBoardService;
import com.spring.petsitter.board.mboard.MemberBoardVO;
import com.spring.petsitter.board.mboard.ReportArticleVO;
import com.spring.petsitter.board.mboard.ReportReplyVO;

@Controller
public class AdminController {
	
	@Autowired
	private MemberBoardService memberboardService;
	
	@Autowired
	private MReplyService mreplyService;
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private PetsitterService petsitterService;

	@Autowired
	private UsinglistService usinglistService;
	
<<<<<<< HEAD
	/* 메인 페이지 */
=======
	/* 관리자 메인 페이지 */
>>>>>>> origin/PGKIM
	@RequestMapping(value = "/admin.me")
	public String admin_main(Model model,
			@RequestParam(value = "page", required = false, defaultValue = "1") int page) {
		
		int limit = 10;

		int listcount = memberboardService.getListCount();

		int startrow = (page - 1) * 10 + 1;
		int endrow = startrow + limit - 1;
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		hashmap.put("startrow", startrow);
		hashmap.put("endrow", endrow);
		List<MemberBoardVO> mboard_list = memberboardService.getBoardList(hashmap); 
		
		ReportArticleVO report_a = new ReportArticleVO();		
		List<ReportArticleVO> ra_list = memberboardService.getReportArticleList(report_a);
		ReportReplyVO report_r = new ReportReplyVO();
		List<ReportReplyVO> rr_list = memberboardService.getReportReplyList(report_r);
		
		model.addAttribute("page", page);
		model.addAttribute("listcount", listcount);
		model.addAttribute("mboard_list", mboard_list);
		model.addAttribute("ra_list", ra_list);
		model.addAttribute("rr_list", rr_list);

		return "admin/dist/index";
	}
	
<<<<<<< HEAD
	/* 본문 신고 페이지 */
=======
	/* 글 신고 페이지 */
>>>>>>> origin/PGKIM
	@RequestMapping(value = "/admin_reportArticle.me")
	public String admin_report_article(Model model) {
		
		ReportArticleVO report_a = new ReportArticleVO();		
		List<ReportArticleVO> ra_list = memberboardService.getReportArticleList(report_a);
		ReportReplyVO report_r = new ReportReplyVO();
		List<ReportReplyVO> rr_list = memberboardService.getReportReplyList(report_r);
		
		model.addAttribute("ra_list", ra_list);
		model.addAttribute("rr_list", rr_list);

		return "admin/dist/report_article";
	}
	
	/* 리플 신고 페이지 */
	@RequestMapping(value = "/admin_reportReply.me")
	public String admin_report_reply(Model model) {
		
		ReportArticleVO report_a = new ReportArticleVO();		
		List<ReportArticleVO> ra_list = memberboardService.getReportArticleList(report_a);
		ReportReplyVO report_r = new ReportReplyVO();
		List<ReportReplyVO> rr_list = memberboardService.getReportReplyList(report_r);
		
		model.addAttribute("ra_list", ra_list);
		model.addAttribute("rr_list", rr_list);

		return "admin/dist/report_reply";
	}
	
	/* 회원 관리 페이지 */
	@RequestMapping(value = "admin_memberManage.me")
	public String admin_member_manage(Model model) {
		
		ReportArticleVO report_a = new ReportArticleVO();		
		List<ReportArticleVO> ra_list = memberboardService.getReportArticleList(report_a);
		ReportReplyVO report_r = new ReportReplyVO();
		List<ReportReplyVO> rr_list = memberboardService.getReportReplyList(report_r);

		model.addAttribute("ra_list", ra_list);
		model.addAttribute("rr_list", rr_list);
		
		ArrayList<PetsitterVO> petsitterList = new ArrayList<PetsitterVO>();
		petsitterList = petsitterService.petsitterList();
		model.addAttribute("petsitter_list", petsitterList);

		ArrayList<MemberVO> memberList = new ArrayList<MemberVO>();
		memberList = memberService.memberList();
		model.addAttribute("member_list", memberList);

		
		return "admin/dist/member_manage";
	}
	
<<<<<<< HEAD
=======
	/* 펫시터 신청 목록 페이지 */
	@RequestMapping(value = "admin_petsitterApply.me")
	public String admin_petsitter_apply(Model model) {
		
		ArrayList<PetsitterVO> petsitterList = new ArrayList<PetsitterVO>();
		petsitterList = petsitterService.petsitterList();
		model.addAttribute("petsitter_list", petsitterList);		
		
		return "admin/dist/apply_petsitter";
	}
	
	
>>>>>>> origin/PGKIM
	/* 펫시터 관리 페이지 */
	@RequestMapping(value = "admin_petsitterManage.me")
	public String admin_petsitter_manage(Model model) {
		
		ReportArticleVO report_a = new ReportArticleVO();		
		List<ReportArticleVO> ra_list = memberboardService.getReportArticleList(report_a);
		ReportReplyVO report_r = new ReportReplyVO();
		List<ReportReplyVO> rr_list = memberboardService.getReportReplyList(report_r);

		model.addAttribute("ra_list", ra_list);
		model.addAttribute("rr_list", rr_list);
		
		ArrayList<PetsitterVO> petsitterList = new ArrayList<PetsitterVO>();
		petsitterList = petsitterService.petsitterList();
		model.addAttribute("petsitter_list", petsitterList);

		ArrayList<MemberVO> memberList = new ArrayList<MemberVO>();
		memberList = memberService.memberList();
		model.addAttribute("member_list", memberList);

		
		return "admin/dist/petsitter_manage";
	}
	
<<<<<<< HEAD
	/* 강제 탈퇴 */
=======
	/* 회원 탈퇴 */
>>>>>>> origin/PGKIM
	@RequestMapping(value = "/outmember.me")
	public String member_out(@RequestParam(value="id", required=true) String id) throws Exception {
		memberService.deleteMember(id);
		
<<<<<<< HEAD
		System.out.println(id + " ���� �Ϸ�");
=======
		System.out.println(id + " 회원 탈퇴");
>>>>>>> origin/PGKIM
		
		return "redirect:/admin_memberManage.me";
	}
	
	/* 회원 정지 */
	@RequestMapping(value = "suspendedmember.me")
	public String member_suspended(@RequestParam(value="id", required=true) String id) throws Exception {
		memberService.suspendedMember(id);
		
<<<<<<< HEAD
		System.out.println(id + " ���� �Ϸ�");
=======
		System.out.println(id + " 등급 정지");
>>>>>>> origin/PGKIM
		
		return "redirect:/admin_memberManage.me";
	}
	
<<<<<<< HEAD
	/* 회원 복귀 */
=======
	/* 회원 복구 */
>>>>>>> origin/PGKIM
	@RequestMapping(value = "rollbackmember.me")
	public String member_rollback(@RequestParam(value="id", required=true) String id) throws Exception {
		memberService.rollbackMember(id);
		
<<<<<<< HEAD
		System.out.println(id + " ���� �Ϸ�");
=======
		System.out.println(id + " 등급 복구");
>>>>>>> origin/PGKIM
		
		return "redirect:/admin_memberManage.me";
	}
	
<<<<<<< HEAD
	/* 등급 변경 */
=======
	/* 회원 변경 */
>>>>>>> origin/PGKIM
	@RequestMapping(value = "changemember.me")
	// public void member_change(@RequestParam(value="rank", required=true) String rank, @RequestParam(value="id", required=true) String id) throws Exception {
	public void member_change(String rank, String id) throws Exception {
		
		System.out.println("rank : " + rank);
		System.out.println("id : " + id);
		
		memberService.changeMember(rank, id);
		
<<<<<<< HEAD
		System.out.println(id + " ���� �Ϸ�");
	}
	
	/* 본문 신고 처리 N -> Y */
	@RequestMapping(value = "checkArticle.me")
	public String report_article_check(@RequestParam(value="id", required=true) String id, @RequestParam(value="num", required=true) int num) throws Exception {
		mreplyService.checkArticle(id, num);
		
		System.out.println(id + " ó�� �Ϸ�");
		
		return "redirect:/admin_reportArticle.me";
	}
	
	/* 본문 신고 처리 Y -> N */
=======
		System.out.println(id + " 변경 완료");
	}
	
	/* 글 처리 N -> Y */
	@RequestMapping(value = "checkArticle.me")
	public String report_article_check(@RequestParam(value="id", required=true) String id, @RequestParam(value="num", required=true) int num) throws Exception {
		mreplyService.checkArticle(id, num);
				
		return "redirect:/admin_reportArticle.me";
	}
	
	/* 글 처리 Y -> N */
>>>>>>> origin/PGKIM
	@RequestMapping(value = "checkArticle2.me")
	public String report_article_check2(@RequestParam(value="id", required=true) String id, @RequestParam(value="num", required=true) int num) throws Exception {
		mreplyService.checkArticle2(id, num);
		
<<<<<<< HEAD
		System.out.println(id + " ó�� �Ϸ�");
		
		return "redirect:/admin_reportArticle.me";
	}
	
	/* 리플 신고 처리 N -> Y */
=======
		return "redirect:/admin_reportArticle.me";
	}
	
	/* 리플 처리 N -> Y */
>>>>>>> origin/PGKIM
	@RequestMapping(value = "checkReply.me")
	public String report_reply_check(@RequestParam(value="bno", required=true) String bno, @RequestParam(value="rno", required=true) String rno, @RequestParam(value="id", required=true) String id) throws Exception {
		mreplyService.checkReply(bno, rno, id);
		return "redirect:/admin_reportReply.me";
	}
	
<<<<<<< HEAD
	/* 리플 신고 처리 Y -> N */
=======
	/* 리플 처리 Y -> N */
>>>>>>> origin/PGKIM
	@RequestMapping(value = "checkReply2.me")
	public String report_reply_check2(@RequestParam(value="bno", required=true) String bno, @RequestParam(value="rno", required=true) String rno, @RequestParam(value="id", required=true) String id) throws Exception {
		mreplyService.checkReply2(bno, rno, id);
		return "redirect:/admin_reportReply.me";
	}
}
