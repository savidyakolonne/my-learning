# Use the base image from the dockerhub
FROM node:20-alpine

# set the work directory
WORKDIR /app

# copy the package.json and package-lock.json files
COPY package*.json ./

# Install the dependencies
RUN npm install

# Copy the rest of files
COPY . .

# Expose the root directory
EXPOSE 5173

# Start the application
CMD [ "npm", "run", "dev" ]
