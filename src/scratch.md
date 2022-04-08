
# Spring Studies

     ModelAndView
        Model: Key value map of data used to render the page
        View: a templete of the page that is filled with data from the model

        Rendering is a process used in web development 
        that turns website code into the interactive pages users see when they visit a website. 
        The term generally refers to the use of HTML, CSS, and JavaScript codes. 
        The process is completed by a rendering engine, 
        the software used by a web browser to render a web page.
        
        The Controller returns both (model and view) at once.scratch.md

    Servlets
    Since Tomcat is a Servlet container, naturally every HTTP request sent to a Tomcat web server 
    is processed by a Java servlet. So the Spring Web application entry point is, not surprisingly,
    a servlet.


    DispatcherServlet as the Heart of Spring MVC


    Also, note that you are not required to return a ModelAndView instance from a controller method.
    You may return a view name, or a ResponseEntity or a POJO that will be converted to a JSON 
    response etc.

    Camadas:
    Model: regras de negócio da aplicação, transação com o BD, persistências e integrações com APIs.
    View: interfaces (páginas HTML)
    Controller: conexão entre a camada View e Model.