# BOOK2HAND

1. What is the proposed name for your Web application?
    - BOOK2HAND
2. Who is the target audience for your Web application?
    - Students who have some used books and no need to use them anymore. And Students who want to buy used books rather than brand new books.
3. What problem is it intended to solve for the target audience?
    - Because of the high prices, many students like to buy used books rather than brand new books. And some others have books they do not want to read anymore, so they can sell books to people who need them. Exchanging books on my website means both of them can reach their goals quickly. Sellers put their books on the website and provide names, prices, images etc. Buyers can find the books they want on the website.
4. How will it meet the minimum project requirements?
    - My site will use the totally free model. Users can view the content and search books without a login. But if users want to buy or sell books, they must sign up and log in, and their information will be stored in my database. Also books' information will be recorded in the database as long as the sellers provide it. I'll use PayPal for payments. Sellers must provide their PayPal account information and some other necessary information to obtain proceeds, and buyers can only use PayPal to pay. All public data will be accessible through RESTful services. All RESTful services will data in both JSON and XML formats. 
5. Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?
     - My site will recommand different books to different kinds of users according to their basic information, searching keywords, content viewed and accomplished deals. I'll recommand a housewife some books about cooking and recommand a businessman some books about economics.


Assignment 1.3
	
	cloned the teacher's code, changed some html contents and java functions

## Build status

TODO : Modify to match your project specific Travis Build
[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-zhangchi940617)

## Changelog

[Changelog](CHANGELOG.md)

## Web Site

[BOOK2HAND](https://secret-woodland-48637.herokuapp.com/)

## Key Features

TODO : Please list key features of your project.

* Key Feature 1
* Key Feature 2
* Key Feature N

## Project Details

### Landing Page

TODO : please provide a description of your landing page inluding a screen shot ![](https://.../image.JPG)

### User Input Form

TODO : please provide a description of at least 1 user input form including a screen shot ![](https://.../image.jpg)

## API

TODO : please provide a description of at least 1 API including a sample of request data and response data in both XML and JSON format.

### API Method 1

    POST photos/:id/tags

#### Parameters

- **id** _(required)_ — The Photo ID to add tags for.
- **tags** _(required)_ — Comma separated tags.

#### Response

A JSON or XMLobject containing the PhotoID and list of tags accepted.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — The photo was not found.

#### Example

##### Request

    POST /v1/photos/123456/tags

##### Body

    tags=cute,puppy


##### JSON Response

```json
{
    "photoId": 123456,
    "tags": ["cute", "puppy"]
}
```

##### XML Response

```xml
<?xml version="1.0" encoding="UTF-8"?>
<PhotoTags>
    <photoId>123456</PhotoId>
        <tags>
            <tag>cute</tag>
            <tag>puppy</tag>
        </tags>
</PhotoTags>
```

## Technologies Used

TODO : List all technologies used in your project

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.
