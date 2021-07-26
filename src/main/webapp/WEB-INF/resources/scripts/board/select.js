window.addEventListener('DOMContentLoaded', () => {
    const select = window.document.getElementById('selectForm');
    const callback = () => {
        select.addEventListener('change', () => {
            alert('성공');
        });
    };
    Ajax.request('POST', '/board/write/select', callback, fallback, formData);
});