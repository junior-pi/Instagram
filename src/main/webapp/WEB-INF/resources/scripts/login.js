window.addEventListener('DOMContentLoaded', () => {
    const passwordInput = window.document.querySelector('[rel="password-input"]');
    const loginSubmit = window.document.querySelector('[rel="loginButton"]');
    const minPassword = 6;

    passwordInput.addEventListener('input', () => {
        if (passwordInput.value.length >= minPassword) {
            loginSubmit.removeAttribute('disabled');
        } else {
            loginSubmit.setAttribute('disabled', '');
        }
    })
});