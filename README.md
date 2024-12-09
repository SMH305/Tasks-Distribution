LOGIN and Registration:

In the login.php script, user login authentication is processed by verifying input credentials, fetching user data from the database, and utilizing password_verify for password validation. Upon successful login, user IDs and types are stored in sessions, with an option to remember login credentials securely through cookies. Users are redirected to the home page post-login, while error messages are displayed for incorrect login attempts.

The registration.php script manages the registration process by validating user input fields, ensuring the correct format of UOB email addresses, and confirming password consistency. Valid input data is then hashed for password security using password_hash. The script also checks for existing email registrations in the database and provides appropriate error messages in case of issues. After successful registration, users are directed to the login page to access the room booking system.
