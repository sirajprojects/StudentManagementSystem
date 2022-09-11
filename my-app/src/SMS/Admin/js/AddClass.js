import React from "react";
import { Outlet, Link } from "react-router-dom";

export default function AddClass() {
  return (
    <>
      <body>
        {/* <!-- Preloader Start Here --> */}
        <div id="preloader"></div>
        {/* <!-- Preloader End Here --> */}
        <div id="wrapper" className="wrapper bg-ash">
          {/* <!-- Header Menu Area Start Here --> */}
          <div className="navbar navbar-expand-md header-menu-one bg-light">
            <div className="navbar-head">
              <div className="header-logo"></div>
              <div className="toggle-button sidebar-toggle"></div>
            </div>
            <div className="d-md-none mobile-nav-bar">
              <button
                className="navbar-toggler pulse-animation"
                type="button"
                data-toggle="collapse"
                data-target="mobile-navbar"
                aria-expanded="false"
              >
                <i className="far fa-arrow-alt-circle-down"></i>
              </button>
              <button
                type="button"
                className="navbar-toggler sidebar-toggle-mobile"
              >
                <i className="fas fa-bars"></i>
              </button>
            </div>
            <div
              className="header-main-menu collapse navbar-collapse"
              id="mobile-navbar"
            >
              <ul className="navbar-nav">
                <li>
                  <div className="dropdown-menu dropdown-menu-right">
                    <div className="item-header">
                      <h6 className="item-title">03 Notifiacations</h6>
                    </div>
                    <div className="item-content">
                      <div className="media">
                        <div className="item-icon bg-skyblue">
                          <i className="fas fa-check"></i>
                        </div>
                        <div className="media-body space-sm">
                          <div className="post-title">Complete Today Task</div>
                          <span>1 Mins ago</span>
                        </div>
                      </div>
                      <div className="media">
                        <div className="item-icon bg-orange">
                          <i className="fas fa-calendar-alt"></i>
                        </div>
                        <div className="media-body space-sm">
                          <div className="post-title">Director Metting</div>
                          <span>20 Mins ago</span>
                        </div>
                      </div>
                      <div className="media">
                        <div className="item-icon bg-violet-blue">
                          <i className="fas fa-cogs"></i>
                        </div>
                        <div className="media-body space-sm">
                          <div className="post-title">Update Password</div>
                          <span>45 Mins ago</span>
                        </div>
                      </div>
                    </div>
                  </div>
                </li>
              </ul>
            </div>
          </div>
          {/* <!-- Header Menu Area End Here -->
        <!-- Page Area Start Here --> */}
          <div className="dashboard-page-one">
            {/* <!-- Sidebar Area Start Here --> */}
            <div className="sidebar-main sidebar-menu-one sidebar-expand-md sidebar-color">
              <div className="mobile-sidebar-header d-md-none">
                <div className="header-logo">
                  <Link to="/">
                    <img src="img/logo1.png" alt="logo" />
                  </Link>
                </div>
              </div>
              <div className="sidebar-menu-content">
                <ul className="nav nav-sidebar-menu sidebar-toggle-view">
                  <li className="nav-item sidebar-nav-item">
                    <Link to="" className="nav-link">
                      <i className="flaticon-classmates"></i>
                      <span>Students</span>
                    </Link>
                    <ul className="nav sub-group-menu sub-group-active">
                      <li className="nav-item">
                        <Link to="/all-student.html" className="nav-link">
                          <i className=""></i>All Students
                        </Link>
                      </li>

                      <li className="nav-item">
                        <Link to="/admit-form.html" className="nav-link">
                          <i className=""></i>Admission Form
                        </Link>
                      </li>
                      <li className="nav-item">
                        <Link
                          to="/student-profile-update.html"
                          className="nav-link"
                        >
                          <i className=""></i>Profile Update
                        </Link>
                      </li>
                    </ul>
                  </li>
                  <li className="nav-item sidebar-nav-item">
                    <Link to="/" className="nav-link">
                      <i className="flaticon-multiple-users-silhouette"></i>
                      <span>Teachers</span>
                    </Link>
                    <ul className="nav sub-group-menu sub-group-active">
                      <li className="nav-item">
                        <Link to="/all-teacher.html" className="nav-link">
                          <i className=""></i>All Teachers
                        </Link>
                      </li>

                      <li className="nav-item">
                        <Link to="/add-teacher.html" className="nav-link">
                          <i className=""></i>Add Teacher
                        </Link>
                      </li>
                      <li className="nav-item">
                        <Link to="/update-profile.html" className="nav-link">
                          <i className=""></i>Profile Update
                        </Link>
                      </li>
                    </ul>
                  </li>

                  <li className="nav-item sidebar-nav-item">
                    <Link to="/" className="nav-link">
                      <i className="flaticon-maths-class-materials-cross-of-a-pencil-and-a-ruler"></i>
                      <span>Class</span>
                    </Link>
                    <ul className="nav sub-group-menu sub-group-active">
                      <li className="nav-item">
                        <Link to="/all-class.html" className="nav-link">
                          <i className=""></i>All Classes
                        </Link>
                      </li>
                      <li className="nav-item">
                        <Link to="/add-class" className="nav-link menu-active">
                          <i className=""></i>Add New Class
                        </Link>
                      </li>
                    </ul>
                  </li>


                  <li className="nav-item">
                    <Link to="/all-subject.html" className="nav-link">
                      <i className="flaticon-open-book"></i>
                      <span>Subject</span>
                    </Link>
                  </li>
                  <li className="nav-item">
                    <Link to="/class-routine.html" className="nav-link">
                      <i className="flaticon-calendar"></i>
                      <span>Class Routine</span>
                    </Link>
                  </li>
                  <li className="nav-item">
                    <Link to="/student-attendence.html" className="nav-link">
                      <i className="flaticon-checklist"></i>
                      <span>Attendence</span>
                    </Link>
                  </li>

                  <li className="nav-item">
                    <Link to="/account-settings.html" className="nav-link">
                      <i className="flaticon-settings"></i>
                      <span>Account</span>
                    </Link>
                  </li>
                </ul>
              </div>
            </div>
            {/* <!-- Sidebar Area End Here --> */}
            <div className="dashboard-content-one">
              {/* <!-- Breadcubs Area Start Here --> */}
              <div className="breadcrumbs-area">
                <h3>Classes</h3>
                <ul></ul>
              </div>
              {/* <!-- Breadcubs Area End Here -->
                <!-- Add Class Area Start Here --> */}
              <div className="card height-auto">
                <div className="card-body">
                  <div className="heading-layout1">
                    <div className="item-title">
                      <h3>Add New Class Schedule</h3>
                    </div>
                  </div>
                  <form className="new-added-form">
                    <div className="row">
                      <div className="col-xl-3 col-lg-6 col-12 form-group">
                        <label>Teacher Name *</label>
                        <input
                          type="text"
                          placeholder=""
                          className="form-control"
                        />
                      </div>
                      <div className="col-xl-3 col-lg-6 col-12 form-group">
                        <label>ID No</label>
                        <input
                          type="text"
                          placeholder=""
                          className="form-control"
                        />
                      </div>
                      <div className="col-xl-3 col-lg-6 col-12 form-group">
                        <label>Gender *</label>
                        <select className="select2">
                          <option value="">Please Select</option>
                          <option value="1">Male</option>
                          <option value="2">Female</option>
                          <option value="3">Others</option>
                        </select>
                      </div>
                      <div className="col-xl-3 col-lg-6 col-12 form-group">
                        <label>Class</label>
                        <select className="select2">
                          <option value="">Please Select</option>
                          <option value="1">Play</option>
                          <option value="2">Nursery</option>
                          <option value="3">One</option>
                          <option value="3">Two</option>
                          <option value="3">Three</option>
                          <option value="3">Four</option>
                          <option value="3">Five</option>
                        </select>
                      </div>
                      <div className="col-xl-3 col-lg-6 col-12 form-group">
                        <label>Subject *</label>
                        <select className="select2">
                          <option value="">Please Select*</option>
                          <option value="1">English</option>
                          <option value="2">Mathmethics</option>
                          <option value="3">Physics</option>
                          <option value="3">Chemestry</option>
                          <option value="3">Biology</option>
                        </select>
                      </div>
                      <div className="col-xl-3 col-lg-6 col-12 form-group">
                        <label>Section *</label>
                        <select className="select2">
                          <option value="">Please Select *</option>
                          <option value="1">Pink</option>
                          <option value="2">Blue</option>
                          <option value="3">Bird</option>
                          <option value="3">Rose</option>
                          <option value="3">Red</option>
                        </select>
                      </div>
                      <div className="col-xl-3 col-lg-6 col-12 form-group">
                        <label>Time *</label>
                        <input
                          type="text"
                          placeholder=""
                          className="form-control"
                        />
                      </div>
                      <div className="col-xl-3 col-lg-6 col-12 form-group">
                        <label>Date*</label>
                        <input
                          type="text"
                          placeholder="dd/mm/yyyy"
                          className="form-control air-datepicker"
                          data-position="bottom right"
                        />
                        <i className="far fa-calendar-alt"></i>
                      </div>
                      <div className="col-xl-3 col-lg-6 col-12 form-group">
                        <label>Phone *</label>
                        <input
                          type="text"
                          placeholder=""
                          className="form-control"
                        />
                      </div>
                      <div className="col-xl-3 col-lg-6 col-12 form-group">
                        <label>E-Mail *</label>
                        <input
                          type="email"
                          placeholder=""
                          className="form-control"
                        />
                      </div>
                      <div className="col-md-6 form-group"></div>
                      <div className="col-12 form-group mg-t-8">
                        <button
                          type="submit"
                          className="btn-fill-lg btn-gradient-yellow btn-hover-bluedark"
                        >
                          Save
                        </button>
                      </div>
                    </div>
                  </form>
                </div>
              </div>
              {/* <!-- Add Class Area End Here --> */}
              <footer className="footer-wrap-layout1"></footer>
            </div>
          </div>
          {/* <!-- Page Area End Here --> */}
        </div>

        <script src="C:\Users\shaik.sirajuddin01\Desktop\SMS\A\js\jquery-3.3.1.min.js"></script>

        <script src="C:\Users\shaik.sirajuddin01\my-app\src\SMS\Admin\js\bootstrap.min.js"></script>

        <script src="C:\Users\shaik.sirajuddin01\my-app\src\SMS\Admin\js\select2.min.js"></script>

        <script src="C:\Users\shaik.sirajuddin01\my-app\src\SMS\Admin\js\datepicker.min.js"></script>

        <script src="C:\Users\shaik.sirajuddin01\my-app\src\SMS\Admin\js\main.js"></script>
      </body>
    </>
  );
}
