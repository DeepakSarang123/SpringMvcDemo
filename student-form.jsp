<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
 <title>Student Registration Form</title>
</head>



<body>

  <form:form action = "processForm" modelAttribute = "student">
  
    First name : <form:input path = "firstName"/>
    
    <br><br>
    
    Last name : <form:input path = "lastName" />
  
    <br><br>
    
    Country:
    <form:select path="country">
       
     <form:options items = "${student.countryOptions}"/>
     
    
    </form:select>
     
        <br><br>
        
         Favorite language : 
         <form:radiobutton path="favoriteLanguage" items = "${student.favoriteLanguage}"/>
        
        <br><br>
        
        OperatingSystem : 
        Windows10<form:checkbox path="operatingSystems" value = "Windows10"/>
        Linux<form:checkbox path="operatingSystems" value = "Linux"/>
        Ubuntu<form:checkbox path="operatingSystems" value = "Ubuntu"/>
        Kubuntu<form:checkbox path="operatingSystems" value = "Kubuntu"/>
        
        
    <input type = "submit" value = "Submit"/>
    
  </form:form>

</body>
</html>