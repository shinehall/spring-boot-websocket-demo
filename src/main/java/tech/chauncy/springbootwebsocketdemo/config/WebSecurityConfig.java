//package tech.chauncy.springbootwebsocketdemo.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("/", "/login").permitAll().anyRequest().authenticated()
//				.and().formLogin().loginPage("/login").defaultSuccessUrl("/chat").permitAll().and()
//				.logout().permitAll();
//	}
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("chauncy").password("111111").roles("USER").and()
//				.withUser("hall").password("111111").roles("USER");
//	}
//
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		web.ignoring().antMatchers("/resources/static/**");
//	}
//
//}
