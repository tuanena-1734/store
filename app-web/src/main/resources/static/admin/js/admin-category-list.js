$(document).ready(function () {
    $(".change-status-category").on('click', function (event) {
        event.stopPropagation();
        if ($(this).data('disabled')) {
            event.preventDefault();
            return false;
        }
        let tagValue = $(this).find("a");
        let inputValue = $(this).find("input");
        let newStatus = inputValue.data('original') === 2 ? 3 : 2;
        let data = {'isEnabled': newStatus};
        let id = $(this).data('id');
        if ($(this).find("a")) {
            $.ajax({
                method: 'POST',
                url: `/api/categories/${id}/change-status`,
                contentType: 'application/json',
                data: JSON.stringify(data),
                success: function () {
                    if (newStatus === 2) {
                        tagValue.addClass("active");
                    } else {
                        tagValue.removeClass("active");
                    }
                    inputValue.data('original', newStatus);
                }, error: function (response) {
                    alertDanger({message: response.responseText});
                }
            });
        }
    });
});