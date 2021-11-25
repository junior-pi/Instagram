window.addEventListener('DOMContentLoaded', () => {
    const select = window.document.getElementById('selectForm');
    select['file'].addEventListener('change', () => {
        //location.href="detail";
        const callback = (resp) => {
            const respJson = JSON.parse(resp);
            if (respJson != null) {
                const callback = () => {
                    alert('callback');
                };
                const fallback = () => {
                    alert('fallback2');
                };
                Ajax.request('POST', '/board/write/detail', callback, fallback);
            }
        };
        const fallback = () => {
            alert('fallback');
        };
        const formData = new FormData();
        Ajax.request('POST', '/board/write/select', callback, fallback, formData);
    });
});