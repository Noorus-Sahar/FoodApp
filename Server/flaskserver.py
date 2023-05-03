from flask import Flask
app = Flask(__name__)
@app.route("/getcategory")
def get_category_data():
    return {"CategoryList": [
        {
            "title":"Pizza",
            "pic":"E:\\8th Semester\\SMD\\K190224Assignment4\\app\\src\\main\\res\\drawable-hdpi\\cat_1.png"
        },
        {
            "title":"Burger",
            "pic":"E:\\8th Semester\\SMD\\K190224Assignment4\\app\\src\\main\\res\\drawable-hdpi\\cat_2.png"
        
        },
        {
            "title" : "HotDog",
            "pic": "E:\\8th Semester\\SMD\\K190224Assignment4\\app\\src\\main\\res\\drawable-hdpi\\cat_3.png"
        },
        {
            "title" : "Drink",
            "pic": "E:\\8th Semester\\SMD\\K190224Assignment4\\app\\src\\main\\res\\drawable-hdpi\\cat_4.png"
        },
        {
            "title" : "Donut",
            "pic": "E:\\8th Semester\\SMD\\K190224Assignment4\\app\\src\\main\\res\\drawable-hdpi\\cat_5.png"
        }
    ]}
@app.route("/getpopularlist")
def get_popular_data():
    return {"PopularList": [
        {
            "title":"Peperroni Pizza",
            "descp":"Slices pepperoni, mozzarella cheese, fresh olives, ground black pepper,pizza sauce",
            "pic":"E:\\8th Semester\\SMD\\K190224Assignment4\\app\\src\\main\\res\\drawable-hdpi\\pop_1.png",
            "fees":"9.76"
        },
        {
            "title":"Cheese Burger",
            "descp":"Beef, Cheddar Cheese, Special Sauce, served with fresh Lettuce",
            "pic":"E:\\8th Semester\\SMD\\K190224Assignment4\\app\\src\\main\\res\\drawable-hdpi\\pop_2.png",
            "fees":"8.5"
        },
        {
            "title":"Vegetable Pizza",
            "descp":"Vegetable Oil, Olive Oil, Mozzarella cheese, Pitted Kalamata, Cherry Tomatoes",
            "pic":"E:\\8th Semester\\SMD\\K190224Assignment4\\app\\src\\main\\res\\drawable-hdpi\\pop_3.png",
            "fees":"7.65"
        }
    ]}

if __name__ == "__main__":
    app.run(debug=True) 