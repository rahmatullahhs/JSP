<%@include file="header.jsp" %>

<div class="container my-3">
    <div class="bg-success text-center">
        <h1 class="jumborton">Add student</h1>
    </div>
    <!--    start form-->
    <form action="addStu.jsp"  method="post">
        <div class="row">
            <div class="col-md-6">
                <label for="name" class="form-label">Name</label>
                <input type="text" class="form-control" id="name" name="name" placeholder="Full Name">
            </div>

            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Email</label>
                <input type="text" class="form-control" id="email" name="email" placeholder="example@gmail.com">
            </div>        
        </div>
        <!-- start 2nd row-->
        <div class="row mt-3">
            <div class="col-md-6">
                <label  class="form-label">Subject</label>
                <select class="form-select" name="role" aria-label="Default select example">
                    <option selected>Select Anyone</option>
                    <option value="developer">Developer</option>
                    <option value="programmer">Programmer</option>
                    <option value="engineer">Engineer</option>
                    <option value="architecture">Architecture</option>
                </select>
            </div>
           
            <div class="row">
                <div class="col-md-6">
                    <label for="salary" class="form-label">Fee</label>
                    <input type="text" class="form-control" id="salary" name="salary" placeholder="salary">
                </div>

            </div>

            <div class="row mt-3 text-center">
                <div class="col-md-6">
                    <button type="submit" class="btn btn-success text-center" >Save</button>

                </div>

                <div class="col-md-6">
                    <button type="reset" class="btn btn-danger text-center" >Reset</button>

                </div>
            </div>
    </form>

    <!--end form    -->
</div>


<%@include file="footer.jsp" %>