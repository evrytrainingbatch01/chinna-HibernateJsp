<html>
<body>

<center>
  
<h1> HelatheCare Application </h1>

        <form action="PatientController" method="GET">
            <table>
                <tr>
                    <td> Patient Name: </td>
                    <td><input type="text" name="pname"></td>
                </tr>
                <tr>
                    <td> Age: </td>
                    <td><input type="text" name="age"></td>
                </tr>
                     <tr>
                    <td> Blood -Group: </td>
                    <td><input type="text" name="bgroup"></td>
                </tr>
                  <tr>
                    <td> Check-Up: </td>
                    <td><select name="checkup">
                         <option>IP</option>
                          <option>Emergency</option>
                      </select></td>
                </tr>
                <tr>
                    <td> Doctors: </td>
                    <td><select name="doctors">
                          <option>DERMOTOLGY</option>
                         <option>CARDIOLOGY</option>
                         <option>ACCEDENT&EMERGENCY</option>
                            <option>DIABETES</option>
                      </select></td>
                </tr>
                 <tr>
                    <td> TestCase: </td>
                    <td><input type="text" name="tcase"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="addPatient" value="save"></td>
                    
                </tr>   
            </table>
          </form>    
                  <form action="PatientController" method="POST">
            <input type="submit" name="showPatients" value="showPatientsList"> &nbsp; &nbsp;<br>
              </form>
</center>
</body>
</html>
