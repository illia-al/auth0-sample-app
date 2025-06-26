# Auth0 Backend Integration Showcase

This project demonstrates backend integration with the Auth0 authentication service using a Java backend and a React frontend.

## Prerequisites

Before starting, you must:
- Create an Auth0 Application.
- Create an Auth0 API.

## Configuration

### Backend

Update your backend configuration with the following properties from your Auth0 dashboard:

```properties
spring.security.oauth2.resourceserver.jwt.issuer-uri=YOUR_AUTH0_ISSUER_URI
spring.security.oauth2.resourceserver.jwt.audiences=YOUR_AUTH0_API_IDENTIFIER
```

Replace `YOUR_AUTH0_ISSUER_URI` and `YOUR_AUTH0_API_IDENTIFIER` with your actual Auth0 values.

### Frontend

In the `front-end/src/auth_config.json` file, populate the following fields with values from your Auth0 dashboard:

```json
{
  "domain": "YOUR_AUTH0_DOMAIN",
  "clientId": "YOUR_AUTH0_CLIENT_ID",
  "audience": "YOUR_AUTH0_API_IDENTIFIER"
}
```

- `domain`: Your Auth0 domain (e.g., `dev-xxxxxx.us.auth0.com`)
- `clientId`: The Client ID of your Auth0 Application
- `audience`: The Identifier of your Auth0 API

## Project Structure

- **Backend:** Java service (this directory)
- **Frontend:** React application located in the `front-end` folder. See `front-end/README.md` for details.

## Running the Project

### Start the Frontend

First, install dependencies in the `front-end` directory:

```bash
npm install
# or
yarn install
```

Then, run the frontend application:

```bash
npm run spa
# or
yarn run spa
```

### Start the Backend

Run the Java service as usual (e.g., using your IDE or `./mvnw spring-boot:run`).

---

For more details on the frontend, see [`front-end/README.md`](front-end/README.md).