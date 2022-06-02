<html>
<head></head>
<body>

<h2> Fll form </h2>
<form action="registerUser" method="post">

    <label for="uname">Name: </label>
    <div>
        <input type="text" name="name" id="uname" placeholder="full name"/>
    </div>
    <br>
    <label for="urole">Role:</label>
    <div>
        <select name="role" id="urole">
            <option value="software developer">Software Developer </option>
            <option value="software tester">Software tester </option>
            <option value="software trainee">Software trainee </option>
            <option value="teach lead">Tech Lead </option>
        </select>
    </div>
    <br>
    <label for="uemail">Email: </label>
    <div>
        <input type="email" name="email" id="uemail"/>
    </div>
    <br>
    <label for="udate">Date:</label>
    <div>
        <input type="date" name="date" id="udate"/>
    </div>

    <br>
    <label for="age"> Age: </label>
    <div>
       <input type="number" name="age" id="age" />
    </div>
    <br>
    <label for="feeling">Are you happy?: </label>
    <div>
       <input type="checkbox" name="feeling" id="feeling" value="happy" />
    </div>
    <br>
    <label for="ugender">Gender: </label>
    <div>
               <input type="radio" name="gender" id="ugender" value="male"> Male
               <input type="radio" name="gender" id="ugender" value="female"> Female
               <input type="radio" name="gender" id="ugender" value="other"> Other
    </div>
    <br>
    <label for="udesc">Describe Yourself:</label>
    <div>
        <textarea name="desc" id="udesc"> </textarea>
    </div>
    <br>
    <label for="cr">Course:</label>
    <div>
        <select name="crse" id="cr">
            <option value="btech">BTECH</option>
            <option value="bca">BCA</option>
            <option value="mca">MCA</option>
        </select>
    </div>

    <br>
    <div>
        <input type="radio" name="terms" value="checked"/> terms
    </div>
    <br>

    <div>
        <input type="submit" value="Submit" />
        <input type="reset" value="Reset" />
    </div>


</form>

  <a href="http://52.43.27.14/:8080/webtest/showdata"> show all data</a>


</body>
</html>