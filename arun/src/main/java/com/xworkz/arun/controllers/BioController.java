package com.xworkz.arun.controllers;

import java.time.LocalDateTime; 
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.arun.dto.BeveragesDTO;
import com.xworkz.arun.dto.ChatDTO;
import com.xworkz.arun.dto.EducationDTO;
import com.xworkz.arun.dto.FamilyDTO;
import com.xworkz.arun.dto.MobileDTO;

@Component
@RequestMapping("/")
public class BioController {
	public BioController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping("/email")
	public String onEmail(Model model) {
		System.out.println("Running the onEmail...");
		model.addAttribute("email", "arunbv9999@gmail.com");
		return "index.jsp";
	}

	@GetMapping("/number")
	public String onNumber(Model model) {
		System.out.println("Running the onNumber...");
		model.addAttribute("number", "9620753670");
		return "index.jsp";
	}

	@GetMapping("/addar")
	public String onAddar(Model model) {
		System.out.println("Running the onAddar...");
		model.addAttribute("number", "928062299115");
		return "index.jsp";
	}

	@GetMapping("/age")
	public String onAge(Model model) {
		System.out.println("Running the onAge...");
		model.addAttribute("age", "25");
		return "index.jsp";
	}

	@GetMapping("/dob")
	public String onDOB(Model model) {
		System.out.println("Running the onDOB...");
		model.addAttribute("dob", LocalDateTime.of(1996, 8, 07, 06, 30));
		return "index.jsp";
	}

	@GetMapping("/salary")
	public String onSalary(Model model) {
		System.out.println("Running the onSalary...");
		model.addAttribute("salary", "50000");
		return "index.jsp";
	}

	@GetMapping("/educationDTO")
	public String onEducationDTO(Model model) {
		System.out.println("Running the onEducationDTO......");
		EducationDTO edu = new EducationDTO();
		edu.setSchoolName("S.M.R.S.K");
		edu.setSchoolDist("Belgaum");
		edu.setSchoolTaluk("Chikkodi");
		edu.setSchoolLocation("Kuppanwadi");
		edu.setDiplomaClgName("HSKP");
		edu.setDiplomaClgLocation("Ballari");
		edu.setDiplomaClgTaluk("Ballari");
		edu.setDiplomaClgDist("Ballari");
		edu.setDegreeClgName("PDIT");
		edu.setDegreeClgLocation("Vijayanagar");
		edu.setDegreeClgTaluk("Vijayanagar");
		edu.setDegreeClgDist("Vijayanagar");
		model.addAttribute("education", edu);
		return "index.jsp";
	}

	@GetMapping("/chat")
	public String onChat(Model model) {
		System.err.println("Running the onChat....");
		ChatDTO chat = new ChatDTO();
		chat.setName("MaliKofta");
		chat.setPrice(350);
		chat.setFamousChat("MaliKofta");
		chat.setPincode(560078D);
		chat.setPhoneNum(9620753670l);
		chat.setSpicy(true);
		chat.setTasty(true);
		chat.setLemons(false);
		chat.setLocation("Vijayanagar");
		chat.setDist("Vijayanagar");
		chat.setTaluk("Vijayanagar");
		chat.setPlace("Near VNC clg Road");
		model.addAttribute("chats", chat);
		return "index.jsp";
	}

	@GetMapping("/mobile")
	public String onMobile(Model model) {
		System.out.println("Running the onMobile....");
		MobileDTO phone = new MobileDTO();
		phone.setModel("Redmi note 7Pro");
		phone.setCompanyName("MI");
		phone.setRam(4);
		phone.setRom(60);
		phone.setCost(16500);
		model.addAttribute("call", phone);
		return "index.jsp";
	}

	@GetMapping("/drinks")
	public String onDrinks(Model model) {
		System.out.println("Running the onDrinks..");
		BeveragesDTO chill = new BeveragesDTO();
		chill.setName("MilkShake");
		chill.setCold(true);
		chill.setHot(false);
		chill.setPrice(150);
		chill.setLocation("Rajajinagar");
		chill.setDist("Bangaloure");
		chill.setTaluk("Bangaloure");
		chill.setPlace("Rajajinagar");
		model.addAttribute("chillout", chill);
		return "index.jsp";
	}

	@GetMapping("/family")
	public String onFamily(Model model) {
		System.out.println("Running the onFamily..");
		FamilyDTO fam = new FamilyDTO();
		fam.setFatherName("Kashinath.B.V");
		fam.setMotherName("Kavitha.B.V");
		fam.setBrotherName("Shivu.B.V");
		fam.setDistName("Vijayanagar");
		fam.setTalukName("H.B.Halli");
		fam.setVillageName("Bannikal");
		fam.setPincodeNum("583214");
		fam.setCaste("Lingayat");
		fam.setYearlyIncome("50000");
		fam.setFatherOccupation("Former");
		fam.setMotherOccupation("HouseWife");
		fam.setBrotherOccupation("Bank Manager");
		model.addAttribute("affection", fam);
		return "index.jsp";
	}

	@GetMapping("/friends")
	public String onFriends(Model model) {
		System.out.println("Running the onFriends...");
		List<String> fri = new ArrayList<String>();
		fri.add("Varun");
		fri.add("Chethan");
		fri.add("Shashi");
		fri.add("Neeraj");
		fri.add("Uday");
		model.addAttribute("names", fri);
		return "index.jsp";
	}

	@GetMapping("places")
	public String onMostVisitedPlaces(Model model) {
		System.out.println("Running the onMostVisitedPlaces..");
		List<String> trip = new ArrayList<String>();
		trip.add("Araku");
		trip.add("Hyderbad");
		trip.add("Mysore");
		trip.add("Hampi");
		trip.add("Dandeli");
		trip.add("Kolkatta");
		trip.add("Vizag");
		trip.add("Ooti");
		model.addAttribute("visited", trip);
		return "index.jsp";
	}

	@GetMapping("/skills")
	public String onSkills(Model model) {
		System.out.println("Runing the onSkills....");
		List<String> skils = new ArrayList<String>();
		skils.add("Java");
		skils.add("HTML");
		skils.add("CSS");
		skils.add("SQL");
		skils.add("BOOSTRAP");
		skils.add("SPRING");
		skils.add("SERVLETS");
		skils.add("LOMBOK");
		skils.add("QUARKUS");
		skils.add("JSP");
		skils.add("JSIL");
		model.addAttribute("softSkills", skils);
		return "index.jsp";
	}

}
