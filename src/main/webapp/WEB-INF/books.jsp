<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="header&footer/header.jsp"/>



<div class="container">
    <div class="row align-items-center mt-4">
        <div class="col-md-8">
            <h1>Book List</h1></a>
        </div>
        <div class="col-md-4 text-right">

            <button type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#">
                Dodaj książkę
            </button>
            <button type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#authorModalForm">
                Dodaj autora
            </button>
        </div>
    </div>
</div>
<div class="modal fade" id="authorModalForm" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle"
     aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalCenterTitle">Dodawanie nowego autora</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form>
                    <div class="form-group">
                        <label for="author-first-name" class="col-form-label">Imię:</label>
                        <input type="text" class="form-control" id="author-first-name">
                    </div>
                    <div class="form-group">
                        <label for="author-last-name" class="col-form-label">Nazwisko:</label>
                        <input type="text" class="form-control" id="author-last-name">
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Anuluj</button>
                <button type="button" class="btn btn-primary">Zapisz</button>
            </div>
        </div>
    </div>
</div>




<jsp:include page="header&footer/footer.jsp"/>
