Sure! Here's a **Day 2 lab** that builds directly on top of the lab you described. It assumes students have already completed a Spring Boot app that displays a list of books and now need to add functionality for submitting new books via a form.

---

## Lab: Add Book Form to Your Book List Web App

### Learning Objectives:

* Use `@ModelAttribute` to bind form data to a model
* Create a `GET` route to display a form
* Create a `POST` route to handle form submissions
* Use `th:object` and `th:field` in Thymeleaf for form binding
* Append submitted books to an existing list

---

### Part 1: Update the Controller

#### 1 Create a new `GET /books/new` route

* Add a method to your controller that shows a form for adding a new book
* should send an empty object to the thymeleaf template using the model


---

#### 2️ Create a `POST /books` route

* Add a method to handle form submission
* 


---

### Part 2: Create `add-book.html`

* In the `templates` folder, add a new file called `add-book.html`.
* This page should contain a form that will be used for creating a new book
---

### Part 3: Add Navigation Link

At the top of your `book-list.html`, add a link to the form page:

```html
<a href="/books/new">Add a New Book</a>
```

