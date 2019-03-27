<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
 <%@page import="java.util.ArrayList" %>
 <%@page import="java.util.Iterator" %>
 <%@page import="com.evry.Patient" %>
<!DOCTYPE html>
<html>
   
    <body>
    <h3>ALL Patients Details</h3>
    <%
	
		Object ob = request.getAttribute("listPatients");
		if(ob instanceof ArrayList){
			if(ob != null){
				ArrayList al = (ArrayList)ob;
				Iterator itr = al.iterator();
				
				while(itr.hasNext()){
					Object object = itr.next();
					if(object instanceof Patient){
						Patient patient = (Patient)object;
						/* out.println(" Patient Name : " + patient.getPatientName() 
									+ " Patient Age : " + patient.getPatientAge()
										+ " Blood Group : " + patient.getBloodGroup()
											+ " Checkup type : " + patient.getCheckUp()
												+ " Doctor name : " + patient.getDoctorName()
													+ " Test REcommended : " + patient.getTestRecommended()
														);
						out.println("<br></br>"); */
						
						out.println("<table border='1' align='center'>");
						   out.println("<tr>");
						   out.println("<th>Patient Name</th>");
						   out.println("<th>Age</th>");
						   out.println("<th>Bgruop</th>");
						   out.println("<th>Checkup</th>");
						   out.println("<th>Doctors</th>");
						   out.println("<th>Tcase</th>");
							out.println("<tr>");
							out.println("<td>" + patient.getPname() + "</td>");
							out.println("<td>" + patient.getAge() + "</td>");
							out.println("<td>" + patient.getBgroup() + "</td>");
							out.println("<td>" + patient.getCheckup()+ "</td>");
							out.println("<td>" + patient.getDoctors() + "</td>");
							out.println("<td>" + patient.getTcase() + "</td>");
							out.println("</tr>");
						out.println("</table>");
						
					}
				}
			}
		}
	
	%>
  
    
        </body>
        </html>