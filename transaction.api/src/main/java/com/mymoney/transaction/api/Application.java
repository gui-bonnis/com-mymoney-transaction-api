package com.mymoney.transaction.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

  // @Bean
  // ApplicationListener<AvaliabilityChangeEvent<?>> avalabilityChangeEventApplicationListener() {
  //   return event -> System.out.println(event.getResolvableType() + " : " + event.getState());
  // }
  // @Bean
  // ApplicationListener<ApplicationReadEvent> applicationReadEventApplicationListener(CustomerRepository customerRepository) {
  //   return event -> Flux.just("gui", "gu", "gi").
  //     .map(name -> new Customer(null, name))
  //     .flatMap(customerRepository::save)
  //     .subscribe(System.out::println);
  //
  // }
}

// @Controller
// @ResponseBody
// @RequiredArgsConstructor
// class CustomerControlle {
//
//   private CustomerRepository customerRepository;
//
//   @GetMapping("/customers")
//   Flux<Customer> get() {
//     return this.customerRepository.findAll();
//   }
// }
//
// public interface CustomerRepository extends ReactiveCrudRepository<Customer, Integer> {}
//
// public record Customer(@Id Integer id, String name) {}
