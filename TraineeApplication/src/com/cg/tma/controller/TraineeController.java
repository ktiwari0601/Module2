package com.cg.tma.controller;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;






import com.cg.tma.entities.Trainee;
import com.cg.tma.service.TraineeService;



@Controller
public class TraineeController 
{
	
	static Integer SHOW_PAR_VIEW = 1;
	static Integer SHOW_FULL_VIEW = 2;
	
	@Autowired
	TraineeService tser;
	
	@RequestMapping("start")
	public String showhome(Model model)
	 {
		 return "Home";
	 }
	@RequestMapping("add")
	public String addtrainee(@ModelAttribute("trainee")Trainee trainee,Model model)
	 {
		 model.addAttribute("trainee",trainee);
		 return "addDetails";
	 }
	@RequestMapping("addDetails")
	 public String insertTrainee(@Valid @ModelAttribute("trainee")Trainee trainee,BindingResult res,Model model)
	 {
		 if(res.hasErrors())
		 {
			 model.addAttribute("trainee",trainee);
			 return "addDetails";
		 }
		 else
		 {
			 tser.addTrainee(trainee);
			 model.addAttribute("trainee",trainee);
			 return "Home";
		 }
		
	 }
	@RequestMapping("delete")
	public String deletetrainee(@ModelAttribute("trainee")Trainee trainee,Model model)
	{
		 model.addAttribute("trainee",trainee);
		 model.addAttribute("view_mode",SHOW_PAR_VIEW);
		 return "deleteDetails";
	}
	
	@RequestMapping("deleteDetails")
	 public String deletetraineeNow(@ModelAttribute("traineeId")Integer traineeId,Model model)
	 {
		 
		 
			 model.addAttribute("traineeId",traineeId);
			 Trainee trainee=tser.retrieveTrainee(traineeId);
			 model.addAttribute("trainee",trainee);
			 model.addAttribute("view_mode",SHOW_FULL_VIEW);
			 return "deleteDetails";
		
	 }
	@RequestMapping("deleteNow")
	public String deletetraineeNow1(@ModelAttribute("trainee")Trainee trainee,Model model)
	 {
		 
		 	
			 model.addAttribute("trainee",trainee);
			 tser.deleteTrainee(trainee.getTraineeId());
			 return "Home";
		
	 }
	@RequestMapping("retrieveAll")
	 public String showTraineeDetails(Model model)
	 {
		 List<Trainee> tlist=tser.fetchAllTrainee();
		 model.addAttribute("tlist",tlist);
		 return "Display";
	 }
	
	@RequestMapping("retrieve")
	 public String showTrainee(@ModelAttribute("trainee")Trainee trainee,Model model)
	 {
		model.addAttribute("view_mode",SHOW_PAR_VIEW);
		model.addAttribute("trainee",trainee);
		return "showDetails";
	 }
	@RequestMapping("showDetails")
	public String displayTrainee(@ModelAttribute("trainee")Trainee trainee,Model model)
	 {
		 
		 Trainee trainee1=tser.retrieveTrainee(trainee.getTraineeId());
		 model.addAttribute("trainee1",trainee1);
		 model.addAttribute("view_mode",SHOW_FULL_VIEW);
		 return "showDetails";
	 }
	@RequestMapping("modify")
	 public String modifyTrainee(@ModelAttribute("trainee")Trainee trainee,Model model)
	 {
		
		model.addAttribute("trainee",trainee);
		model.addAttribute("view_mode",SHOW_PAR_VIEW);
		return "modifyDetails";
	 }
	@RequestMapping("modifyDetails")
	public String modifyTraineeDetails(@ModelAttribute("traineeId")Integer traineeId,Model model)
	 {
		 
		
		 Trainee trainee=tser.retrieveTrainee(traineeId);
		 model.addAttribute("trainee",trainee);
		 model.addAttribute("view_mode",SHOW_FULL_VIEW);
		 return "modifyDetails";
	 }
	@RequestMapping("finalModify")
	public String finalModifyTrainee(@ModelAttribute("trainee")Trainee trainee,
			Model model)
	 {
		
		tser.modify(trainee);
		return "Home";
		
	 }
}
