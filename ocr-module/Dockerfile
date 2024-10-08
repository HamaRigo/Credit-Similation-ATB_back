# Use an official Java runtime as a parent image
FROM openjdk:17-jdk

# Set the working directory in the container
WORKDIR /app
# Debugging step to list files in the build context
RUN ls -l
# Copy the OCR module's jar file and the configuration file into the container
COPY target/ocrs-module.jar /app/ocrs-module.jar
COPY ocrs.xml /app/ocrs.xml

# Install required libraries, including Tesseract
RUN apt-get update && \
    apt-get install -y tesseract-ocr tesseract-ocr-eng && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# Set environment variables if necessary
ENV OCR_CONFIG_PATH=/app/ocrs.xml

# Expose the port the application will run on
EXPOSE 9090

# Run the OCR module
ENTRYPOINT ["java", "-jar", "/app/ocrs-module.jar"]
