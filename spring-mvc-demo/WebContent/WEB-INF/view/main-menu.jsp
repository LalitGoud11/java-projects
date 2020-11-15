<!DOCTYPE html>
<html lang="en">

    <head>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/vendor/css/normalize.css">  
        
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/vendor/css/grid.css">  

        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/style.css">
        
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/vendor/css/ionicons.min.css">
        
        <link href="https://fonts.googleapis.com/css?family=Lato:100,300,400" rel="stylesheet">
        
        <title>omnifood</title>    

    
    </head>

    <body>
        
        <header>
            <nav >
                <div class="row">
                
                    <img src="${pageContext.request.contextPath}/assets/img/logo-white.png" alt="Omnin Food Logo" class="omnilogo">
                
                <ul class="main-nav">
                    <li><a href="#">food delivery</a></li>
                    <li><a href="#">how it works</a></li> 
                    <li><a href="#">our cities</a></li>
                    <li><a href="#">sign up</a></li>
                </ul>
                    
                 </div>
             </nav>
        
            <div class="hero-text">

                <h1>Goodbye junk food.<br> Hello super healthy meals.</h1> 
                <a class="butn btn-1" href="#"> I'm hungry </a> 
                <a class="butn btn-2" href="#"> Show me more  </a>  

            </div>
        
        
        </header>
        
        
        <section>
        
            <div class="row">
                <h2>Get food fast &mdash; not fast food.</h2>
                <p class="h2underpara">
                Hello, we’re Omnifood, your new premium food delivery service. We know you’re always busy. No time for cooking. So let us take care of that, we’re really good at it, we promise! 
                    
                   
                </p>
            </div>
            
            <div class="row">
                
                <div class="col span-1-of-4">
                    <i class="ion-ios-infinite-outline  icons-big"></i>
                    <h3>Up to 365 days/year</h3>
                    <p>Up to 365 days/year
                        Never cook again! We really mean that. Our subscription plans include up to 365 days/year coverage. You can also choose to order more flexibly if that's your style.
                    </p>
                </div>
            
            
             
                <div class="col span-1-of-4">
                     <i class="ion-ios-stopwatch-outline icons-big"></i>
                    <h3>Ready in 20 minutes</h3>
                    <p>
                     You're only twenty minutes away from your delicious and super healthy meals delivered right to your home. We work with the best chefs in each town to ensure that you're 100% happy.

                    </p>
                </div>
           
            
             
                <div class="col span-1-of-4">
                     <i class="ion-ios-nutrition-outline icons-big"></i>
                    <h3>100% organic</h3>
                    <p>
                       All our vegetables are fresh, organic and local. Animals are raised without added hormones or antibiotics. Good for your health, the environment, and it also tastes better!
                    </p>
                </div>
            
            
            
             
                <div class="col span-1-of-4">
                     <i class="ion-ios-cart-outline icons-big"></i>
                    <h3>Order anything</h3>
                    <p>We don't limit your creativity, which means you can order whatever you feel like. You can also choose from our menu containing over 100 delicious meals. It's up to you!
                    </p>
                </div>
            </div>
        
        </section>
        
        <section class="meals-section">
        
                <ul class="meal-top-bottom clr-img">
                
                    <li>
                        <figure class="figsec">
                        <img src="${pageContext.request.contextPath}/assets/img/1.jpg" alt="img1">
                        </figure>
                    </li>
                    <li>
                        <figure class="figsec">
                        <img src="${pageContext.request.contextPath}/assets/img/2.jpg" alt="img2">
                        </figure>
                    </li>
                    <li>
                        <figure class="figsec">
                        <img src="${pageContext.request.contextPath}/assets/img/3.jpg" alt="img3">
                        </figure>
                    </li>
                    <li>
                        <figure class="figsec">
                        <img src="${pageContext.request.contextPath}/assets/img/4.jpg" alt="img4">
                        </figure>
                    </li>
            
                </ul>
                
                 <ul class="meal-top-bottom clr-img">
                
                    <li>
                        <figure class="figsec">
                        <img src="${pageContext.request.contextPath}/assets/img/5.jpg" alt="img5">
                        </figure>
                    </li>
                    <li>
                        <figure class="figsec">
                        <img src="${pageContext.request.contextPath}/assets/img/6.jpg" alt="img6">
                        </figure>
                    </li>
                    <li>
                        <figure class="figsec">
                        <img src="${pageContext.request.contextPath}/assets/img/7.jpg" alt="img7">
                        </figure>
                    </li>
                    <li>
                        <figure class="figsec">
                        <img src="${pageContext.request.contextPath}/assets/img/8.jpg" alt="img8">
                        </figure>
                    </li>
            
                </ul>
        
        
        
        </section>
        
        
        <section class="form-section">
                <div class="row">
                <h2> form section</h2>
                </div>
            
                <div class="row">
                    
                        <form class="form-class" action="collectPageNext" method="get" >
                                <div class="row">
                                <label class="col span-1-of-3" for="name">First name</label>
                                <input class="col span-2-of3" type="text" name="firstname" id="name" placeholder="first name" >
                                </div>
                                
                                 <div class="row">
                                    <label class="col span-1-of-3" for="fname">Last name:</label>
                                    <input class="col span-2-of3 " type="text" name="lastname" id="lname" placeholder="Last name" >  
                                    </div>
                                <div class="row">
                                    
                                <div class="row">
                                <label class="col span-1-of-3" for="@">Email:</label>
                                <input class="col span-2-of3 " type="email" name="email" id="@" placeholder="omnifood@gmail.com" >  
                                </div>    
                                    
                                <div class="row">
                                <label class="col span-1-of-3" for="ph">Phone-number:</label>
                                <input class="col span-2-of3 " type="tel" id="ph" name="phone"
                                       pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}"  placeholder="000-000-0000" >
 
                                </div>
                                    
                                <input class="submit-button" type="submit" value="click me!"   > 
                            </div>
                                
                        </form>
                        
                </div>
        				<a href="children/studentform">click me</a>
        </section>
        
        
    </body>

</html>
