(function ($) {
  $.validator.setDefaults({
    submitHandler: function (form) {
       let name = form[0].val();
        console.log(name);
//         $.ajax({
//            type: "POST",
//            url: window.location.origin + "/carinho/produto/update/" + id,
//            data: {
//                csrf_token: csrf_token,
//                id: carinho_id,
//                produto_id: produto_id,
//                quantidade: quantidade,
//            }
//        }).done(function() {
//         //Add user in table
//        });
    }
  });
  
    $('#form').validate({
        rules: {
            name: {
                required: true
            },
            email: {
                required: true,
                email: true
            },
            dateOfBirth: {
                required: true
            }
        },
        messages: {
            name: {
                required: $.validator.messages.required
            },
            email: {
                required: $.validator.messages.required,
                email: $.validator.messages.email
            },
            dateOfBirth: {
                required: $.validator.messages.required
            }
        },
        errorElement: 'span',
        errorPlacement: function (error, element) {
            error.addClass('invalid-feedback');
            element.closest('.form-group').append(error);
        },
        highlight: function (element, errorClass, validClass) {
            $(element).addClass('is-invalid');
        },
        unhighlight: function (element, errorClass, validClass) {
            $(element).removeClass('is-invalid');
        }
    });

    $('#table').DataTable({
        "paging": true,
        "lengthChange": true,
        "searching": true,
        "ordering": true,
        "info": true,
        "autoWidth": true,
        "language": {
            "lengthMenu": "Mostrar _MENU_",
            "zeroRecords": "Nenhum dado encontrado",
            "info": "Pagina _PAGE_ de _PAGES_",
            "infoEmpty": "Dados indisponiveis",
            "infoFiltered": "(filtered from _MAX_ total records)"
        }
    });

    $('#dateOfBirth').datepicker({
        showWeek: true,
        firstDay: 0,
        dateFormat: "dd/mm/yy",
        dayNames: [
            "Domingo",
            "Segunda-Feira",
            "TerÃ§a-Feira",
            "Quarta-Feira",
            "Quinta-Feira",
            "Sexta-Feira",
            "SÃ¡bado"
        ],
        dayNamesMin: ["D", "S", "T", "Q", "Q", "S", "S"],
        monthNames: [
            "Janeiro",
            "Fevereiro",
            "MarÃ§o",
            "Abril",
            "Maio",
            "Junho",
            "Julho",
            "Agosto",
            "Setembro",
            "Outubro",
            "Novembro",
            "Dezembro"
        ],
        monthNamesShort: [
            "Jan",
            "Fev",
            "Mar",
            "Abr",
            "Mai",
            "Jun",
            "Jul",
            "Ago",
            "Set",
            "Out",
            "Nov",
            "Dez"
        ],
        showButtonPanel: true,
        currentText: "Hoje",
        closeText: "Fechar",
        weekHeader: "#"
    });


})(jQuery);