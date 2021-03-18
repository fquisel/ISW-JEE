/*jQuery(document).ready(function () {
                $('#listarBien').dataTable( {
                 "Processing": true,
       			 "ServerSide": true,
                 ajax: {
                    url: "/sanmateo/controlador/ListarBien",
                    type: "GET", 
                    contentType: "application/json; charset=utf-8",
           			dataType: 'json'
                }
              });
              
 });
 */
 
 $(document).ready(function() {
    $('#listarBien').DataTable( {
        "ajax": "/sanmateo/controlador/ListarBien",
        type: "GET", 
            contentType: "application/json; charset=utf-8",
   			dataType: 'json'
    } );
} );