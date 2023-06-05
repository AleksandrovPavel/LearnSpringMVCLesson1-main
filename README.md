Задание MVC.
1) Изучить структуру MVC.
   https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#spring-web
   https://www.baeldung.com/spring-mvc-tutorial
   https://spring.io/guides/gs/serving-web-content/
   http://spring-projects.ru/projects/spring-framework/
   https://habr.com/ru/articles/500572/
2) Посмотреть ключевые аннотации:
   @Controller
   @RequestMapping
   @GetMapping, @PostMapping, @PutMapping, @DeleteMapping, @PatchMapping
   @PathVariable, @RequestParam, @ResponseBody, @RequestBody, @ResponseStatus
3) Почитать про thymeleaf на их сайте: https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html
4) Написать простейшее приложение, у которого есть два урла:
   1. Первый это /hello?count={num} Выводится то количество раз Hello world, какое количество num.
      Например:
      /hello?count=3 - должно быть выведено три раза Hello world. Если count  не указано, то по дефолту выводиться 1 раз.
      /user
   2. Второй это /users?name={name}&surname={surname}
      На страничке должно отображаться:
      Привет, {name} {surname}!
5) Для запуска приложения на tomcat надо сделать следующее: 
   1. Скачать tomcat последней версии: https://tomcat.apache.org/download-10.cgi
   2. Выбрать Edit Configurations вверху intelij idea.
   3. Нажать на + и выбрать Tomcat Server -> Local
   4. Указать путь до tomcat, например: /Users/username/Downloads/apache-tomcat-10.0.0-M7
   5. Указать путь jre, например: /Library/Java/JavaVirtualMachines/jdk1.8.0_241.jdk/Contents/Home
   6. Перейти во вкладку Deployment и нажать на + и выбрать Artifact -> mvc:war exploded
   7. Удалите все из Application context и введите /
   8. Удалите из build artifact все, кроме mvc:war exploded
   9. Нажать на Apply и Ok
   10. Запустить tomcat 
   11. Перейти на http://localhost:8080/hello?count=3
   12. Перейти на http://localhost:8080/user?name=Ivan&surname=Ivanov
   13. Проверить, что все работает