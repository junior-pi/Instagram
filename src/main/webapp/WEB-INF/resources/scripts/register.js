window.addEventListener('DOMContentLoaded', () => {
    const registerForm = window.document.getElementById('registerForm');
    const inputs = registerForm.querySelectorAll('input');
    registerForm.onsubmit = () => {
        for (let i = 0; i < inputs.length - 1; i++) {
            let input = inputs[i];
            if (input.dataset.regex !== undefined) {
                let regex = new RegExp(input.dataset.regex);
                let name = input.getAttribute('placeholder');
                if (!regex.test(input.value)) {
                    alert(`올바른 ${name}값을 입력해주세요.`);
                    input.focus();
                    return false;
                }
            }
        }
    };

// TODO : addeventlistener 'blur' >> AJAX >> email, nickname, securityCode

});