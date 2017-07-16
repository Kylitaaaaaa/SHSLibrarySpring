package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after hello.Application path)
public class MainController {
	@Autowired
	private ReviewRepository reviewRepository;
	


	@GetMapping(path="/allReview")
	public @ResponseBody Iterable<Review> getAllReview() {
		// This returns a JSON or XML with the users
		return reviewRepository.findAll();
	}
}
