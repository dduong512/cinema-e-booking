package hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        /* HTML view documents */
        registry.addViewController("/addMovie").setViewName("addMovie");
        registry.addViewController("/EditMovie").setViewName("EditMovie");
        registry.addViewController("/ManageMovies").setViewName("ManageMovies");
        registry.addViewController("/addTheatre").setViewName("addTheatre");
        registry.addViewController("/adminIndex").setViewName("adminIndex");
        registry.addViewController("/BookingConfirmation").setViewName("BookingConfirmation");
        registry.addViewController("/BrowseMovies").setViewName("BrowseMovies");
        registry.addViewController("/DateAndTimeSelection").setViewName("DateAndTimeSelection");
        registry.addViewController("/EditMovieTime").setViewName("EditMovieTime");
        registry.addViewController("/EditProfile").setViewName("EditProfile");
        registry.addViewController("/editTheatre").setViewName("editTheatre");
        registry.addViewController("/EmployeeAdd").setViewName("EmployeeAdd");
        registry.addViewController("/EmployeeEdit").setViewName("EmployeeEdit");
        registry.addViewController("/EmployeeSearch").setViewName("EmployeeSearch");
        registry.addViewController("/Generatereport").setViewName("Generatereport");
        registry.addViewController("/Login").setViewName("Login");
        registry.addViewController("/ManageShowtimes").setViewName("ManageShowtimes");
        registry.addViewController("/ManageTheatres").setViewName("ManageTheatres");
        registry.addViewController("/PricesEdit").setViewName("PricesEdit");
        registry.addViewController("/PromotionAdd").setViewName("PromotionAdd");
        registry.addViewController("/PromotionEdit").setViewName("PromotionEdit");
        registry.addViewController("/PromotionSearch").setViewName("PromotionSearch");
        registry.addViewController("/PurchaseTickets").setViewName("PurchaseTickets");
        registry.addViewController("/Register").setViewName("Register");
        registry.addViewController("/RegisterVerification").setViewName("RegisterVerification");
        registry.addViewController("/RegisterVerification2").setViewName("RegisterVerification2");
        registry.addViewController("/ScheduleMovies").setViewName("ScheduleMovies");
        registry.addViewController("/SeatSelection").setViewName("SeatSelection");
        registry.addViewController("/TicketSelection").setViewName("TicketSelection");
        registry.addViewController("/UserDelete").setViewName("UserDelete");
        registry.addViewController("/UserSuspend").setViewName("UserSuspend");
        registry.addViewController("/ViewIndividualOrder").setViewName("ViewIndividualOrder");
        registry.addViewController("/ViewMovieDetials").setViewName("ViewMovieDetails");
        registry.addViewController("/ViewOrderHistory").setViewName("ViewOrderHistory");
    }

}
