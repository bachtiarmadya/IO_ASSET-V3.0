/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function hsRestUrl() {
    return "/asset/system";
}

var tableData = {};
$(document).ready(function () {

    $.getJSON(hsRestUrl() + "/vendor", function (data) {
        var tab_data = '';
        tabel = $.each(data, function (key, value) {

            tab_data += '<tr>';
            tab_data += '<td hidden >' + value.vendorid + '</td>';
            tab_data += '<td>' + value.vendorcode + '</td>';
            tab_data += '<td>' + value.vendorname + '</td>';
            tab_data += '<td>' + value.contact + '</td>';
            tab_data += '<td>' + value.email + '</td>';
            tab_data += '<td>' + value.address + '</td>';
            tab_data += '<td>' + value.note + '</td>';
            tab_data += '<td>' + value.rate + '</td>';
            tab_data += '<td class="text-center"><button data-toggle="modal" data-target="#edit-item" class="btn btn-xs btn-default edit-item"><i class="fa fa-pencil"></i></button><button class="btn btn-xs btn-danger remove-item"><i class="fa fa-times"></i></button></td>';
            tab_data += '</tr>';
        });

        $('#assetMasterDT').append(tab_data).DataTable({responsive: true});




       


    });
});
     